package src.main.java.com.ryzhov_andrey.basepatterns.structural.decorator;

public class TraderDecorator implements Trader {
    Trader trader;

    public TraderDecorator(Trader trader) {
        this.trader = trader;
    }

    @Override
    public String tradeCrypto() {
        return trader.tradeCrypto();
    }
}
