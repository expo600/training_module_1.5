package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.mediator;

public interface Mediator {
    public void send(String message, Colleague colleague);
}
