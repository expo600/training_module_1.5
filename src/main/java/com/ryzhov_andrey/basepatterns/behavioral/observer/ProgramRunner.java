package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.observer;

public class ProgramRunner {
    public static void main(String[] args) {
        InternetShop internetShop = new InternetShop();

        Subscriber manager = new Subscriber("Manager");
        Subscriber storekeeper = new Subscriber("Storekeeper");

        internetShop.addObserver(manager);
        internetShop.addObserver(storekeeper);

        internetShop.addOrder("order_1");
        internetShop.addOrder("order_2");
        internetShop.addOrder("order_3");

        internetShop.remove("order_2");



    }
}
