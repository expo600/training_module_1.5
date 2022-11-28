package src.main.java.com.ryzhov_andrey.basepatterns.structural.proxy;

public class ProgramRunner {
    public static void main(String[] args) {
        CryptoRates cryptoRates = new ProxyCryptoRates(new BinanceCryptoRates());

        System.out.println(cryptoRates.getCryptoRate(Token.BTC));
        System.out.println(cryptoRates.getCryptoRate(Token.BNB));
        System.out.println(cryptoRates.getCryptoRate(Token.ETH));
        System.out.println(cryptoRates.getCryptoRate(Token.TRX));
    }
}
