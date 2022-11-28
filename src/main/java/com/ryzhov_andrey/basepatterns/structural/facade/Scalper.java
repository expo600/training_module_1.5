package src.main.java.com.ryzhov_andrey.basepatterns.structural.facade;

public class Scalper {
    public void doScalpNow(CryptoScreener cryptoScreener) {
        if (cryptoScreener.isTradeEntryPoint()) {
            System.out.println("Scalper scalps the crypto ...");
        } else {
            System.out.println("Scalper reading a book ...");
        }
    }
}
