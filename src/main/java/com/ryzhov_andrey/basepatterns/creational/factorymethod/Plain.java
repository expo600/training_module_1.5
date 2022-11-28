package src.main.java.com.ryzhov_andrey.basepatterns.creational.factorymethod;

public class Plain implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivery by plain");
    }
}
