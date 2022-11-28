package src.main.java.com.ryzhov_andrey.basepatterns.creational.factorymethod;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivery by ship");
    }
}
