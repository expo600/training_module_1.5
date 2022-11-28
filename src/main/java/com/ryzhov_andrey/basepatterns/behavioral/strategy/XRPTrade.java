package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.strategy;

public class XRPTrade implements Trade{

    @Override
    public void buy() {
        System.out.println("Buy XRP tokens ...");
    }
}
