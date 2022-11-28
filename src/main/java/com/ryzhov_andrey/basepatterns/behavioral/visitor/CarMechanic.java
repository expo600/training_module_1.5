package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.visitor;

public class CarMechanic implements Visitor{
    @Override
    public void visit(SportCar sportCar) {
        System.out.println("Repairs sport-car ...");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Overhauls the engine ..");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Repairs wheels ...");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Paint the body ...");
    }
}
