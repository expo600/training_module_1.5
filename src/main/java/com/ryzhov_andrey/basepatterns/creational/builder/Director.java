package src.main.java.com.ryzhov_andrey.basepatterns.creational.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildName();
        builder.buildColor();
        builder.buildPrice();
        Car car = builder.getCar();
        return car;
    }
}
