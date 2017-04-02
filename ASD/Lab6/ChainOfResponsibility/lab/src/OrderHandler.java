/**
 * Created by Rajiv on 4/1/2017.
 */
public abstract class OrderHandler {
    protected OrderHandler nexthandler;

    public void setNextOrderHandler(OrderHandler nexthandler){
        this.nexthandler = nexthandler;
    }

    public abstract void handleOrder(Order order);
}
