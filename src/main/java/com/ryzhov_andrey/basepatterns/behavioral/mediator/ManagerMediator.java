package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.mediator;

public class ManagerMediator implements Mediator{
    public Colleague getCustomer() {
        return customer;
    }

    public void setCustomer(Colleague customer) {
        this.customer = customer;
    }

    public Colleague getDeveloper() {
        return developer;
    }

    public void setDeveloper(Colleague programmer) {
        this.developer = programmer;
    }

    public Colleague getTester() {
        return tester;
    }

    public void setTester(Colleague tester) {
        this.tester = tester;
    }

    private Colleague customer;
    private Colleague developer;
    private Colleague tester;

    @Override
    public void send(String msg, Colleague colleague) {
        if (customer == colleague)
        {
            developer.notify(msg);
        }
        else if (colleague == developer)
        {
            tester.notify(msg);
        }else if (colleague == tester)
        {
            customer.notify(msg);
        }
    }

}
