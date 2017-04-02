/**
 * Created by Rajiv on 4/1/2017.
 */
public class Main {
    public static void main(String[] args){
        DomesticOrderHandler domesticOrderHandler = new DomesticOrderHandler();
        InternationalOrderHandler internationalOrderHandler = new InternationalOrderHandler();
        LargeOrderHandler largeOrderHandler = new LargeOrderHandler();
        MostFavoredCustomerOrderHandler mostFavoredCustomerOrderHandler = new MostFavoredCustomerOrderHandler();

        mostFavoredCustomerOrderHandler.setNextOrderHandler(largeOrderHandler);
        largeOrderHandler.setNextOrderHandler(internationalOrderHandler);
        internationalOrderHandler.setNextOrderHandler(domesticOrderHandler);

        OrderReceiver orderReceiver = new OrderReceiver();
        orderReceiver.setOrderHandler(mostFavoredCustomerOrderHandler);

        Order order1 = new Order ("1000", 35500, false,new Customer( "Rukko kei"));


        Order order2 = new Order ("1001", 55520, true,new Customer( "Suzi Santro"));


        Order order3 = new Order ("1002", 35690, false,new Customer( "Midas Mikky"));

    }
}
