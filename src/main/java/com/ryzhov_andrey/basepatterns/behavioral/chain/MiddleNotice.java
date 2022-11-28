package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.chain;

public class MiddleNotice extends Notifier{

    public MiddleNotice(int stage) {
        super(stage);
    }

    @Override
    public void write(String message) {
        System.out.println("The price is approaching the level: " + message);
    }
}
