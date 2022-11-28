package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.observer;

public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
