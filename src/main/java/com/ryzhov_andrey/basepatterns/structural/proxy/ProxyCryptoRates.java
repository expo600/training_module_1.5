package src.main.java.com.ryzhov_andrey.basepatterns.structural.proxy;

public class ProxyCryptoRates implements CryptoRates {
    CryptoRates cryptoRates;
    private String cashedInfo;
    private Token cashedId;

    public ProxyCryptoRates(CryptoRates cryptoRates) {
        this.cryptoRates = cryptoRates;
    }

    @Override
    public String getCryptoRate(Token token) {
        String message;
        if (cashedInfo == null || cashedId != null) {
            message = "Loading info from Binance ...  ";
            cashedInfo = cryptoRates.getCryptoRate(token);
            cashedId = token;
        } else {
            message = "Loading info from cash ...  ";
        }
        return message + cashedInfo;

    }
}