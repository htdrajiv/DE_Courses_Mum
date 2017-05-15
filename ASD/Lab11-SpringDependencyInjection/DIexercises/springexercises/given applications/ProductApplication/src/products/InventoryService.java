package products;

/**
 * Created by Rajiv on 5/14/2017.
 */
public class InventoryService implements IInventoryService {
    @Override
    public int getNumberInStock(int productNumber) {
        return productNumber-200;
    }
}
