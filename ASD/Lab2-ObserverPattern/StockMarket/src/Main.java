public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer buyer = new StockBuyer(market);
        Observer viewer = new StockViewer(market);

        market.addStock("ORC", 12.23);
        market.addStock("MSC", 45.78);

        market.unregister(buyer);

        market.update("ORC", 12.34);
        market.update("MSC", 44.68);

        market.unregister(viewer);
    }
}
