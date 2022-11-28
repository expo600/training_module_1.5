package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.iterator;

public class CryptoExchange implements Collection {
    private String name;
    private String[] tokens;

    public CryptoExchange(String name, String[] tokens) {
        this.name = name;
        this.tokens = tokens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTokens() {
        return tokens;
    }

    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }

    @Override
    public Iterator getIterator() {
        return new TokenIterator();
    }

    private class TokenIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < tokens.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return tokens[index++];
        }
    }
}
