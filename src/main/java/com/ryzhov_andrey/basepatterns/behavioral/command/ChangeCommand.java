package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.command;

public class ChangeCommand implements Command {
    CryptoExchange cryptoExchange;

    public ChangeCommand(CryptoExchange cryptoExchange) {
        this.cryptoExchange = cryptoExchange;
    }

    @Override
    public void execute() {
        cryptoExchange.change();
    }
}
