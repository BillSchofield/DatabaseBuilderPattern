public class OrderBuilder {

    private String number;
    private String customerId;

    public OrderBuilder() {
        number = "1";
        customerId = "1";
    }

    public OrderBuilder withNumber(String number){
        this.number = number;
        return this;
    }

    public OrderBuilder withCustomer(String customerId){
        this.customerId = customerId;
        return this;
    }

    public void build(){
        new CustomerBuilder().withId(customerId).build();

        System.out.println("INSERT INTO Orders (number, customerId, product, quantity)\n" +
                "VALUES ('" + number + "','" + customerId + "','Widget','1');");

    }
}
