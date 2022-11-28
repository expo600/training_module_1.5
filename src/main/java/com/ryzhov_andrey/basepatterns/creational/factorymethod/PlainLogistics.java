package src.main.java.com.ryzhov_andrey.basepatterns.creational.factorymethod;

public class PlainLogistics implements LogisticsFactory {

    @Override
    public Transport createTransport() {
        return new Plain();
    }
}
