package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.state;

public class ProgramRunner {
    public static void main(String[] args) {
        Token token = new Token(new BTCTrade());
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                token.buy();
            } else {
                token.sell();
            }
        }
    }
}
