public class Main {

    public static void main(String[] args) {
        System.out.println("INSERT INTO Customers (Id, CustomerName, ContactName, Address, City, PostalCode, Country) \nVALUES ('1','Name','Contact','Skagen 21','Stavanger','4006','Norway');");
        System.out.println("INSERT INTO Orders (Number, CustomerId, Product, Quantity) \nVALUES ('1','1','Widget','1');");


        // Default customer
        CustomerBuilder customerBuilder = new CustomerBuilder();
        customerBuilder.build();


        // Build two orders for the same customer
        OrderBuilder orderBuilder = new OrderBuilder().withCustomer("1");
        orderBuilder.withNumber("1").build();
        orderBuilder.withNumber("2").build();
    }
}
