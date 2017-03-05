import java.util.Iterator;
import java.util.Map;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class StockViewer implements Observer {
    private AbstractMarket stockMarket;

    public StockViewer(StockMarket stockMarket){
        this.stockMarket = stockMarket;
        this.stockMarket.register(this);
    }

    @Override
    public void update(Map<String, Double> stocklist) {
        System.out.println("StockViewer: stocklist is changed:");
        Iterator iter = stocklist.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println("StockViewer" + key + " - $" + value);
        }
    }
}

