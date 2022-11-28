package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.chain;

public class ImportantNotice extends Notifier{

    public ImportantNotice(int stage) {
        super(stage);
    }

    @Override
    public void write(String message) {
        System.out.println("The price breaks the level: " + message);
    }
}
