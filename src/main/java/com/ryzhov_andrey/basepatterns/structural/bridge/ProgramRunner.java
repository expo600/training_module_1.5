package src.main.java.com.ryzhov_andrey.basepatterns.structural.bridge;

public class ProgramRunner {
    public static void main(String[] args) {
        Scalp[] scalps = {
                new Binance(new ShortScalper()),
                new Kraken(new LongScalper())
        };
        for (Scalp scalp : scalps) {
            scalp.scalperScalp();
        }
    }
}
