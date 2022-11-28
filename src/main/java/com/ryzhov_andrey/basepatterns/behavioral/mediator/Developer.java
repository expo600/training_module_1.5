package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.mediator;

public class Developer extends  Colleague{

    public Developer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Message for developer : " + message);
    }
}
