package src.main.java.com.ryzhov_andrey.basepatterns.structural.decorator;

public class ScalperCryptoTrader extends TraderDecorator {

    public ScalperCryptoTrader(Trader trader) {
        super(trader);
    }

    public String scalpingCrypto() {
        return "Scalp crypto ...\n";
    }

    @Override
    public String tradeCrypto() {
        return super.tradeCrypto() + scalpingCrypto();
    }
}
