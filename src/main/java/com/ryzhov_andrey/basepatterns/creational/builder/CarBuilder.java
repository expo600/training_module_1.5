package src.main.java.com.ryzhov_andrey.basepatterns.creational.builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildName();

    abstract void buildColor();

    abstract void buildPrice();

    public Car getCar() {
        return car;
    }
}
