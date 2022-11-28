package src.main.java.com.ryzhov_andrey.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {
    public static void main(String[] args) {
        TraderFactory traderFactory = new TraderFactory();
        List<Trader> traders = new ArrayList<>();

        traders.add(traderFactory.getTraderBySpeciality("Crypto"));
        traders.add(traderFactory.getTraderBySpeciality("Crypto"));
        traders.add(traderFactory.getTraderBySpeciality("Crypto"));
        traders.add(traderFactory.getTraderBySpeciality("Stock"));
        traders.add(traderFactory.getTraderBySpeciality("Stock"));
        traders.add(traderFactory.getTraderBySpeciality("Stock"));

        for (Trader trader : traders) {
            trader.trading();
        }
    }
}
