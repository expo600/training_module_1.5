package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(List<String> orders) {
        System.out.println("*********************************");
        System.out.println(name + "! A new order has arrived: ");
        System.out.println(orders);
        System.out.println("*********************************");
    }
}
