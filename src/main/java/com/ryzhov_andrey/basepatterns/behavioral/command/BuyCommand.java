package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.command;

public class BuyCommand implements Command {
    CryptoExchange cryptoExchange;

    public BuyCommand(CryptoExchange cryptoExchange) {
        this.cryptoExchange = cryptoExchange;
    }

    @Override
    public void execute() {
        cryptoExchange.buy();
    }
}
