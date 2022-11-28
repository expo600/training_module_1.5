package src.main.java.com.ryzhov_andrey.basepatterns.creational.factorymethod;

public class ProgramRunner {
    public static void main(String[] args) {
        createLogisticByType(TransportType.TRUCK).createTransport().deliver();
        createLogisticByType(TransportType.PLANE).createTransport().deliver();
        createLogisticByType(TransportType.SHIP).createTransport().deliver();
    }

    static LogisticsFactory createLogisticByType(TransportType type) {
        if (type == TransportType.SHIP) {
            return new ShipLogistics();
        } else if (type == TransportType.TRUCK) {
            return new TruckLogistics();
        } else if (type == TransportType.PLANE) {
            return new PlainLogistics();
        }

        throw new RuntimeException(type + "is unknown!!!");
    }
}
