/**
 * Created by Rajiv on 4/1/2017.
 */
public class LargeOrderHandler extends OrderHandler{
    public LargeOrderHandler(){
    }

    public void handleOrder(Order order) {
        if (order.getTotalamount()> 30000.0){
            System.out.println("LargeOrderHandler handles order "+order.getOrderNumber());
        }
        else
            nexthandler.handleOrder(order);
    }
}
