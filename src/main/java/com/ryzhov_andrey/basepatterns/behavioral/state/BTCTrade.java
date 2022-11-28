package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.state;

public class BTCTrade implements Trade {
    @Override
    public void Buy(Token token) {
        System.out.println("The price of BTC is falling ...\n" +
                "Buy BTC ...");
        System.out.println("========================================");
    }

    @Override
    public void Sell(Token token) {
        System.out.println("The price of BTS is rising ...\n" +
                "We look at ETH ...");
        token.setTrade(new ETHTrade());
        System.out.println("========================================");
    }
}
