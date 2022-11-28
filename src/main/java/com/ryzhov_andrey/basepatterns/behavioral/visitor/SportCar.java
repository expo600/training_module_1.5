package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.visitor;

public class SportCar implements Car {
    Car[] cars;

    public SportCar() {
        cars = new Car[]{new Engine(), new Wheel(), new Body()};
    }

    public void accept(Visitor visitor) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
