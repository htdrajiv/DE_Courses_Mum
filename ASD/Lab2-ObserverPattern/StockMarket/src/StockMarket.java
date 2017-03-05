import java.util.ArrayList;

/**
 * Created by Rajiv on 3/5/2017.
 */

public class StockMarket extends AbstractMarket{
    public StockMarket(){
        observers = new ArrayList<>();
    }

    public void addStock(String stockSymbol, Double price){
        stocklist.put(stockSymbol, price);
        notifyObserver();
    }

    public void update(String stockSymbol, Double price){
        stocklist.put(stockSymbol, price);
        notifyObserver();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        System.out.println(" Observer: "+observer.getClass().getName()+" is unregister");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(stocklist);
        }
    }
}
