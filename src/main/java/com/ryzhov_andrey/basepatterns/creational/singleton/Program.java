package src.main.java.com.ryzhov_andrey.basepatterns.creational.singleton;

public class Program {
    public static void main(String[] args) {
        PhoneService.getCaller().call("111-11-11");
        PhoneService.getCaller().call("333-33-33");
        PhoneService.getCaller().call("555-55-55");
    }
}
