package src.main.java.com.ryzhov_andrey.basepatterns.creational.prototype;

public class ProgramRunner {
    public static void main(String[] args) {
        Car car = new Car("RR", "White", 50000);
        System.out.println(car);

        CarFactory carFactory = new CarFactory(car);
        Car carClone = carFactory.cloneCar();
        System.out.println("=================================================================");
        System.out.println(carClone);

    }
}
