public class CustomerBuilder {

    private String name;
    private String contact;
    private String customerId;

    public CustomerBuilder() {
        name = "Cardinal";
        contact = "Tom B. Erichsen";
        customerId = "1";
    }

    public static void main(String[] args) {
        new CustomerBuilder()
                .withName("BillCo")
                .build();

        new CustomerBuilder()
                .withContact("Bill S")
                .build();
    }

    public CustomerBuilder withName(String name){
        this.name = name;
        return this;
    }

    public CustomerBuilder withContact(String contact){
        this.contact = contact;
        return this;
    }

    public void build() {
        System.out.println("INSERT INTO Customers (Id, CustomerName, ContactName, Address, City, PostalCode, Country)\n" +
                "VALUES ('" + customerId +"','" + name + "','" + contact + "','Skagen 21','Stavanger','4006','Norway');");
    }

    public CustomerBuilder withId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}
