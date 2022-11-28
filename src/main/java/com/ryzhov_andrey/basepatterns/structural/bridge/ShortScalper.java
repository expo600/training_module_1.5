package src.main.java.com.ryzhov_andrey.basepatterns.structural.bridge;

public class ShortScalper implements Scalper {
    @Override
    public void scalpCrypto() {
        System.out.println("ShortScalper enters short trades");
    }
}
