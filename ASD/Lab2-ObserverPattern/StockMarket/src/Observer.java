import java.util.Map;

/**
 * Created by Rajiv on 3/5/2017.
 */
public interface Observer {
    void update(Map<String, Double> stocklist);
}
