package src.main.java.com.ryzhov_andrey.basepatterns.structural.flyweight;

public class CryptoTrader implements Trader{
    @Override
    public void trading() {
        System.out.println("CryptoTrader trades crypto ...");
    }
}
