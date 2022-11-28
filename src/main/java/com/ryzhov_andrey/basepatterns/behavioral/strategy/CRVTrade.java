package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.strategy;

public class CRVTrade implements Trade{
    @Override
    public void buy() {
        System.out.println("Buy SRV tokens ...");
    }
}
