package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.visitor;

public interface Visitor {
    void visit(SportCar sportCar);

    void visit(Engine engine);

    void visit(Wheel wheel);

    void visit(Body body);
}
