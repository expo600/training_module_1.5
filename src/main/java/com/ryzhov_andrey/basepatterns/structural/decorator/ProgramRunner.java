package src.main.java.com.ryzhov_andrey.basepatterns.structural.decorator;

public class ProgramRunner {
    public static void main(String[] args) {
        Trader trader = new ScalperCryptoTrader(new InvestorCryptoTrader(new CryptoTrader()));
        System.out.println(trader.tradeCrypto());
    }
}
