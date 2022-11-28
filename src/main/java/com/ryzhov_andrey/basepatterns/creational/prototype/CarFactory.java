package src.main.java.com.ryzhov_andrey.basepatterns.creational.prototype;

public class CarFactory {
    Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    Car cloneCar(){
        return (Car)car.copy();
    }

}
