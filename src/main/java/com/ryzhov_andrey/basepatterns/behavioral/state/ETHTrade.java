package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.state;

public class ETHTrade implements Trade{
    @Override
    public void Buy(Token token) {
        System.out.println("The price of ETH is falling ...\n" +
                "Buy ETH ...");
        System.out.println("========================================");
    }

    @Override
    public void Sell(Token token) {
        System.out.println("The price of ETH is rising ...\n" +
                "We look at BNB ...");
        token.setTrade(new BNBTrade());
        System.out.println("========================================");
    }
}
