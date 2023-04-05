package demo.customer;

import demo.Event;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<String> category;

    private String currency;

//    @JsonProperty("customer_first_name")
    private String customerFirstName;

//    @JsonProperty("customer_full_name")
    private String customerFullName;

//    @JsonProperty("customer_gender")
    private String customerGender;

//    @JsonProperty("customer_id")
    private int customerId;

//    @JsonProperty("customer_last_name")
    private String customerLastName;

//    @JsonProperty("customer_phone")
    private String customerPhone;

//    @JsonProperty("day_of_week")
    private String dayOfWeek;

//    @JsonProperty("day_of_week_i")
    private String dayOfWeekI;

    private String email;

    private List<String> manufacturer;

//    @JsonProperty("products")
    private List<Product> productList;

    private ArrayList<String> sku;

//    @JsonProperty("taxful_total_price")
    private BigDecimal taxfulTotalPrice;

//    @JsonProperty("taxless_total_price")
    private BigDecimal taxlessTotalPrice;

//    @JsonProperty("total_quantity")
    private int totalQuantity;

//    @JsonProperty("total_unique_products")
    private int totalUniqueProducts;

    private String type;

    private String user;

    private GeoIP geoip;

    private Event event;

//    @JsonProperty("order_date")
    private String orderDate;

//    @JsonProperty("order_id")
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public GeoIP getGeoip() {
        return geoip;
    }

    public void setGeoip(GeoIP geoip) {
        this.geoip = geoip;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeekI() {
        return dayOfWeekI;
    }

    public void setDayOfWeekI(String dayOfWeekI) {
        this.dayOfWeekI = dayOfWeekI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(List<String> manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<String> getSku() {
        return sku;
    }

    public void setSku(ArrayList<String> sku) {
        this.sku = sku;
    }

    public BigDecimal getTaxfulTotalPrice() {
        return taxfulTotalPrice;
    }

    public void setTaxfulTotalPrice(BigDecimal taxfulTotalPrice) {
        this.taxfulTotalPrice = taxfulTotalPrice;
    }

    public BigDecimal getTaxlessTotalPrice() {
        return taxlessTotalPrice;
    }

    public void setTaxlessTotalPrice(BigDecimal taxlessTotalPrice) {
        this.taxlessTotalPrice = taxlessTotalPrice;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getTotalUniqueProducts() {
        return totalUniqueProducts;
    }

    public void setTotalUniqueProducts(int totalUniqueProducts) {
        this.totalUniqueProducts = totalUniqueProducts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
