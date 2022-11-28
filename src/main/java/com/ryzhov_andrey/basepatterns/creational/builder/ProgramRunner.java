package src.main.java.com.ryzhov_andrey.basepatterns.creational.builder;

public class ProgramRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new LandRoverBuilder());
        Car car = director.buildCar();
        System.out.println(car);

        director.setBuilder(new BMWBuilder());
        car = director.buildCar();
        System.out.println(car);

    }
}
