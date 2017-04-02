/**
 * Created by Rajiv on 4/1/2017.
 */
public class OrderReceiver {
    OrderHandler orderHandler;

    public void setOrderHandler(OrderHandler orderHandler){
        this.orderHandler = orderHandler;
    }

    public void receiveOrder(Order order){
        orderHandler.handleOrder(order);
    }
}
