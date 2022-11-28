package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.mediator;

public class Tester extends Colleague {

        public Tester(Mediator mediator) {
            super(mediator);
        }

        @Override
        public void notify(String message) {
            System.out.println("Message for tester: " + message);
        }
}
