package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.visitor;

public class CarOwner implements Visitor {
    @Override
    public void visit(SportCar sportCar) {
        System.out.println("Own sport-car...");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Killing the engine...");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Breaks the wheels ...");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Scratches the body ...");
    }
}
