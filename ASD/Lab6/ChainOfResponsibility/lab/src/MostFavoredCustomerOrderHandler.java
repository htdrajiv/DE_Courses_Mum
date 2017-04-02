import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Rajiv on 4/1/2017.
 */

public class MostFavoredCustomerOrderHandler extends OrderHandler {
    private Collection<Customer> mostFavoredCustomerList = new ArrayList<Customer>();

    public MostFavoredCustomerOrderHandler() {
        mostFavoredCustomerList.add(new Customer("Rukko kei"));
        mostFavoredCustomerList.add(new Customer("Suzi Santro"));
    }

    public void handleOrder(Order order) {
        boolean found = false;
        for (Customer cust : mostFavoredCustomerList){
            if (order.getCustomer().getName().equals(cust.getName())){
                found=true;
                System.out.println("MostFavoredCustomerOrderHandler handles order "+order.getOrderNumber());
            }
        }
        if (!found)
            nexthandler.handleOrder(order);
    }
}
