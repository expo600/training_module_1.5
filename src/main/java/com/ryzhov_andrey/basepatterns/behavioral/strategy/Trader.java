package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.strategy;

public class Trader {
    Trade trade;

    public void setTrade(Trade trade) {
        this.trade = trade;
    }

    public void executeTrade() {
        trade.buy();
    }
}
