package src.main.java.com.ryzhov_andrey.basepatterns.structural.proxy;

public class BinanceCryptoRates implements CryptoRates {

    @Override
    public String getCryptoRate(Token token) {
        return "Rate " + token;
    }
}
