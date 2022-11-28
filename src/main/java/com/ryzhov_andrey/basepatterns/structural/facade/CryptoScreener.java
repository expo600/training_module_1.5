package src.main.java.com.ryzhov_andrey.basepatterns.structural.facade;

public class CryptoScreener {
    private boolean tradeEntryPoint;

    public boolean isTradeEntryPoint() {
        return tradeEntryPoint;
    }

    public void entryPointNo() {
        System.out.println("No entering in trade ...");
        tradeEntryPoint = false;
    }

    public void entryPointIs() {
        System.out.println("Entering in trade ...");
        tradeEntryPoint = true;
    }

}
