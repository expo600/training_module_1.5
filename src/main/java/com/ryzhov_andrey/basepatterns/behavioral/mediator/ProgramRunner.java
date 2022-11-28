package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.mediator;

public class ProgramRunner {
    public static void main(String[] args) {
        ManagerMediator mediator = new ManagerMediator();
        Colleague customer = new Customer(mediator);
        Colleague programmer = new Developer(mediator);
        Colleague tester = new Tester(mediator);

        mediator.setCustomer(customer);
        mediator.setDeveloper(programmer);
        mediator.setTester(tester);

        customer.send("Need to make a program");
        programmer.send("The program is ready, you need to test");
        tester.send("The program has been tested and is ready for sale");

    }
}
