package src.main.java.com.ryzhov_andrey.basepatterns.structural.bridge;

public class Binance extends Scalp{

    public Binance(Scalper scalper) {
        super(scalper);
    }

    @Override
    public void scalperScalp() {
        System.out.println("Trade on Binance ...");
        scalper.scalpCrypto();
    }
}
