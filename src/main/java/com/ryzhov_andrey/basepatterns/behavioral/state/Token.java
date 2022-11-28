package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.state;

public class Token {
    private Trade trade;

    public Token(Trade trade) {
        this.trade = trade;
    }

    public void setTrade(Trade trade) {
        this.trade = trade;
    }

    public void buy() {
        trade.Buy(this);
    }

    public void sell() {
        trade.Sell(this);
    }
}
