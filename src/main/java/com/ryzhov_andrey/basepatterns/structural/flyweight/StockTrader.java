package src.main.java.com.ryzhov_andrey.basepatterns.structural.flyweight;

public class StockTrader implements Trader{
    @Override
    public void trading() {
        System.out.println("StockTrader trades stock and bonds...");
    }
}
