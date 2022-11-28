package src.main.java.com.ryzhov_andrey.basepatterns.creational.builder;

public class LandRoverBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName(Name.LAND_ROVER);
    }

    @Override
    void buildColor() {
        car.setColor(Color.WHITE);
    }

    @Override
    void buildPrice() {
        car.setPrice(30000);
    }
}
