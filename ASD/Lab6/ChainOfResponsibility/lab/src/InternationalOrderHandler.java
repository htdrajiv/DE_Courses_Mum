/**
 * Created by Rajiv on 4/1/2017.
 */
public class InternationalOrderHandler extends OrderHandler{
    public InternationalOrderHandler() {
    }

    public void handleOrder(Order order) {
        boolean found = false;
        if (order.isInternational()){
            found=true;
            System.out.println("InternationalOrderHandler handles order "+order.getOrderNumber());
        }
        else
            nexthandler.handleOrder(order);
    }
}
