package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.chain;

public abstract class Notifier {
    private int stage;
    private Notifier nextNotifier;

    public Notifier(int stage) {
        this.stage = stage;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifierTrader(String message,int st) {
        if (st>=stage) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifierTrader(message, st);
        }
    }

    public abstract void write(String message);

}

