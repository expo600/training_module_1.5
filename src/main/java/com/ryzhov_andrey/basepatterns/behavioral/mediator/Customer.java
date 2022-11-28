package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.mediator;

public class Customer extends Colleague {

    public Customer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Message for customer: " + message);
    }
}
