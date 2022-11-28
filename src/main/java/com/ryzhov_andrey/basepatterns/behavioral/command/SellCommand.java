package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.command;

public class SellCommand implements Command {
    CryptoExchange cryptoExchange;

    public SellCommand(CryptoExchange cryptoExchange) {
        this.cryptoExchange = cryptoExchange;
    }

    @Override
    public void execute() {
        cryptoExchange.sell();
    }
}
