import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rajiv on 3/5/2017.
 */
public abstract class AbstractMarket implements Subject {
    List<Observer> observers;
    Map<String,Double> stocklist = new HashMap<String,Double>();
    public Map<String, Double> getStocklist() {
        return stocklist;
    }
}

