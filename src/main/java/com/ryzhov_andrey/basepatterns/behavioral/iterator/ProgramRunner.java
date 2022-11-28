package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.iterator;

public class ProgramRunner {
    public static void main(String[] args) {
        String[] tokens = {"BTC", "ETH", "GALA", "BNB", "SOL", "XRP", "..."};

        CryptoExchange cryptoExchange = new CryptoExchange("Binance", tokens);
        Iterator iterator = cryptoExchange.getIterator();

        System.out.println("Crypto-Exchange: " + cryptoExchange.getName());
        System.out.print("         Tokens: ");

        while (iterator.hasNext())
            System.out.print(iterator.next().toString() + " ");
    }
}
