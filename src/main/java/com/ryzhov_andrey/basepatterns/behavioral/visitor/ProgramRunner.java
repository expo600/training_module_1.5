package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.visitor;

public class ProgramRunner {
    public static void main(String[] args) {
        Car computer = new SportCar();
        computer.accept(new CarOwner());

        System.out.println("\n============================================\n");

        computer.accept(new CarMechanic());
    }
}
