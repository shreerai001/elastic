package demo.customer;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Product {

//    @JsonProperty("base_price")
    private BigDecimal basePrice;
//    @JsonProperty("discount_percentage")
    private float discountPercentage;
    private int quantity;
    private String manufacturer;

//    @JsonProperty("tax_amount")
    private BigDecimal taxAmount;

//    @JsonProperty("product_id")
    private int productId;
    private String category;
    private List<String> sku;

//    @JsonProperty("taxless_price")
    private BigDecimal taxlessPrice;

//    @JsonProperty("until_discount_amount")
    private BigDecimal unitDiscountAmount;

//    @JsonProperty("min_price")
    private BigDecimal minPrice;
    private int id;

//    @JsonProperty("discount_amount")
    private BigDecimal discountAmount;

//    @JsonProperty("created_on")
    private LocalDateTime createdOn;

//    @JsonProperty("product_name")
    private String productName;
    private BigDecimal price;

//    @JsonProperty("taxful_price")
    private BigDecimal taxfulPrice;

//    @JsonProperty("base_unit_price")
    private BigDecimal baseUnitPrice;

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getSku() {
        return sku;
    }

    public void setSku(List<String> sku) {
        this.sku = sku;
    }

    public BigDecimal getTaxlessPrice() {
        return taxlessPrice;
    }

    public void setTaxlessPrice(BigDecimal taxlessPrice) {
        this.taxlessPrice = taxlessPrice;
    }

    public BigDecimal getUnitDiscountAmount() {
        return unitDiscountAmount;
    }

    public void setUnitDiscountAmount(BigDecimal unitDiscountAmount) {
        this.unitDiscountAmount = unitDiscountAmount;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTaxfulPrice() {
        return taxfulPrice;
    }

    public void setTaxfulPrice(BigDecimal taxfulPrice) {
        this.taxfulPrice = taxfulPrice;
    }

    public BigDecimal getBaseUnitPrice() {
        return baseUnitPrice;
    }

    public void setBaseUnitPrice(BigDecimal baseUnitPrice) {
        this.baseUnitPrice = baseUnitPrice;
    }

}
