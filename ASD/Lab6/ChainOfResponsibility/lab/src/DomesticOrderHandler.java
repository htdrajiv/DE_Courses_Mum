/**
 * Created by Rajiv on 4/1/2017.
 */
public class DomesticOrderHandler extends OrderHandler {
    public DomesticOrderHandler() {

    }

    public void handleOrder(Order order) {
        System.out.println("DomesticOrderHandler handles order "+order.getOrderNumber());
    }

}
