package src.main.java.com.ryzhov_andrey.basepatterns.structural.decorator;

public class CryptoTrader implements Trader {
    @Override
    public String tradeCrypto() {
        return "Trades crypto...\n";
    }
}
