package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.command;

public class ProgramRunner {
    public static void main(String[] args) {
        CryptoExchange cryptoExchange = new CryptoExchange();

        Trader trader = new Trader(
                new BuyCommand(cryptoExchange),
                new SellCommand(cryptoExchange),
                new ChangeCommand(cryptoExchange)
        );
        trader.buyCrypto();
        trader.sellCrypto();
        trader.changeCrypto();
    }
}
