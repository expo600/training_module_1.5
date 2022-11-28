package src.main.java.com.ryzhov_andrey.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TraderFactory {
    private static final Map<String, Trader> traders = new HashMap<>();

    public Trader getTraderBySpeciality(String speciality) {
        Trader trader = traders.get(speciality);
        if (trader == null)
            switch (speciality) {
                case "Crypto":
                    System.out.println("Find a crypto-trader");
                    trader = new CryptoTrader();
                    break;
                case "Stock":
                    System.out.println("Find a stock-trader");
                    trader = new StockTrader();
            }
        traders.put(speciality, trader);
        return trader;
    }
}
