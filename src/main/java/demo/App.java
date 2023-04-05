package demo;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.RangeQuery;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.bulk.BulkResponseItem;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.core.search.TotalHits;
import co.elastic.clients.elasticsearch.core.search.TotalHitsRelation;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class App {

    static Logger logger;

    public static void main(String[] args) throws IOException {
        RestClient restClient = RestClient.builder(
                new HttpHost("localhost", 9200)
        ).build();

        ElasticsearchTransport transport = new RestClientTransport(
                restClient,
                new JacksonJsonpMapper());

        ElasticsearchClient elasticsearchClient = new ElasticsearchClient(transport);

        logger = Logger.getLogger(App.class.getName());

        final String index = "test_elastic";

        nestedSearchQuery(index, elasticsearchClient);
    }

    static List<People> getPeopleList() {
        return Arrays.asList(new People(1, "t1", "t2"),
                new People(2, "t2", "t3"),
                new People(3, "t3", "t3"),
                new People(4, "t4", "t4"));
    }

    static void documentSearch(final String indexName, final ElasticsearchClient elasticsearchClient) throws IOException {
        SearchResponse<People> response = elasticsearchClient.search(builder -> builder
                .index(indexName)
                .query(q -> q.match(t -> t.field("firstName").query("shree"))), People.class
        );

        TotalHits totalHits = response.hits().total();
        boolean isExactResult = totalHits.relation() == TotalHitsRelation.Eq;

        if (!isExactResult) {
            logger.info("There are " + totalHits.value() + "results");
        } else {
            logger.info("There are more than " + totalHits.value() + " results");
        }

        List<Hit<People>> hits = response.hits().hits();

        for (Hit<People> hit : hits) {
            People people = hit.source();
            logger.info(people.getFirstName());
        }
    }

    static void createIndex(final String indexName, final ElasticsearchClient elasticsearchClient) throws IOException {
        elasticsearchClient.indices()
                .create(c -> c.index(indexName));

        People people = new People(1, "Shree", "Rai");

        IndexResponse indexResponse = elasticsearchClient.index(i ->
                i.index(indexName)
                        .id("1")
                        .document(people)
        );

        logger.info("Indexed with version " + indexResponse.version());
    }

    static void bulkIndex(final String indexName, final ElasticsearchClient elasticsearchClient) throws IOException {

        List<People> peopleList = getPeopleList();

        BulkRequest.Builder builder = new BulkRequest.Builder();

        for (People people : peopleList) {
            builder.operations(builder1 ->
                    builder1.index(idx -> idx
                            .index(indexName)
                            .document(people)
                    )
            );
        }

        BulkResponse response = elasticsearchClient.bulk(builder.build());

        if (response.errors()) {
            logger.info("Bulk had errors");
            for (BulkResponseItem item : response.items()) {
                if (item.error() != null) {
                    logger.info(item.error().reason());
                }
            }
        }

    }

    static void nestedSearchQuery(final String indexName, final ElasticsearchClient elasticsearchClient) throws IOException {
        Query byName = MatchQuery.of(m -> m
                        .field("firstName")
                        .query("shree"))
                ._toQuery();

        Query byMaxPrice = RangeQuery.of(r -> r
                        .field("lastName")
                        .gte(JsonData.of("rai")))
                ._toQuery();

        SearchResponse searchResponse = elasticsearchClient.search(builder -> builder
                .index(indexName)
                .query(q -> q
                        .bool(b -> b
                                .must(byName)
                                .must(byMaxPrice)
                        )
                ), People.class
        );

        List<Hit<People>> response = searchResponse.hits().hits();
        for (Hit<People> hit : response) {
            People people = hit.source();
            logger.info("Found Person " + people.getFirstName());
        }

//        elasticsearchClient.putScript(r -> r
//                .id("query-script")
//                .script(s -> s
//                        .lang("mustache")
//                        .source("{\"query\":{\"match\":{\"{{firstName}}\":\"{{shree}}\"}}}")
//                )
//
//        );
    }

}
