package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.state;

public class BNBTrade implements  Trade{
    @Override
    public void Buy(Token token) {
        System.out.println("The price of BNB is falling ...\n" +
                "Buy BNB ...");
        System.out.println("========================================");
    }

    @Override
    public void Sell(Token token) {
        System.out.println("The price of BNB is rising ...\n" +
                "We look at BTC ...");
        token.setTrade(new BTCTrade());
        System.out.println("========================================");
    }
}
