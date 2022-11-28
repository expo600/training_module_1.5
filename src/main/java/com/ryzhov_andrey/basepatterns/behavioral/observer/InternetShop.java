package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class InternetShop implements Observed {
    private List<String> orders = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addOrder(String order) {
        orders.add(order);
        notifyObserver();
    }

    public void remove(String order) {
        orders.remove(order);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.orders);
        }
    }
}
