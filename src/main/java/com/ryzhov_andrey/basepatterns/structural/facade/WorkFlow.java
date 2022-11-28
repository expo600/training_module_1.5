package src.main.java.com.ryzhov_andrey.basepatterns.structural.facade;

public class WorkFlow {
    Scalper scalper = new Scalper();
    Scalp scalp = new Scalp();
    CryptoScreener cryptoScreener = new CryptoScreener();

    public void workFlow() {
        scalp.doScalp();
        cryptoScreener.entryPointIs();
        scalper.doScalpNow(cryptoScreener);
    }
}
