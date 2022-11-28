package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.strategy;

public class ProgramRunner {
    public static void main(String[] args) {
        Trader trader = new Trader();

        trader.setTrade(new GalaTrade());
        trader.executeTrade();

        trader.setTrade(new CRVTrade());
        trader.executeTrade();

        trader.setTrade(new XRPTrade());
        trader.executeTrade();


    }
}
