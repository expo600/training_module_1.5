package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.command;

public class Trader {
    Command buy;
    Command sell;
    Command change;

    public Trader(Command buy, Command sell, Command change) {
        this.buy = buy;
        this.sell = sell;
        this.change = change;
    }

    public void buyCrypto() {
        buy.execute();
    }

    public void sellCrypto() {
        sell.execute();
    }

    public void changeCrypto() {
        change.execute();
    }
}
