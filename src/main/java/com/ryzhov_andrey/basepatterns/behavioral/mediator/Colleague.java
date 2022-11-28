package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message)
    {
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}
