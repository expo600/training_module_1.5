package src.main.java.com.ryzhov_andrey.basepatterns.creational.factorymethod;

public class ShipLogistics implements LogisticsFactory {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
