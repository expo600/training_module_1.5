package src.main.java.com.ryzhov_andrey.basepatterns.creational.builder;

public class BMWBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName(Name.BMW);
    }

    @Override
    void buildColor() {
        car.setColor(Color.BLACK);
    }

    @Override
    void buildPrice() {
        car.setPrice(25000);
    }
}
