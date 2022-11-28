package src.main.java.com.ryzhov_andrey.basepatterns.structural.bridge;

public class Kraken extends Scalp {

    public Kraken(Scalper scalper) {
        super(scalper);
    }

    @Override
    public void scalperScalp() {
        System.out.println("Trade on Kraken ...");
        scalper.scalpCrypto();
    }
}
