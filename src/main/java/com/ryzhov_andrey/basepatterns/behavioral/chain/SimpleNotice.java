package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.chain;

public class SimpleNotice extends Notifier {

    public SimpleNotice(int stage) {
        super(stage);
    }

    @Override
    public void write(String message) {
        System.out.println("Nothing happens: " + message);
    }
}
