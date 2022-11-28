package src.main.java.com.ryzhov_andrey.basepatterns.structural.decorator;

public class InvestorCryptoTrader extends TraderDecorator {

    public InvestorCryptoTrader(Trader trader) {
        super(trader);
    }

    public String investingCrypto() {
        return "Investing in crypto ...\n";
    }

    @Override
    public String tradeCrypto() {
        return super.tradeCrypto() + investingCrypto();
    }
}
