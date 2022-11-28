package src.main.java.com.ryzhov_andrey.basepatterns.creational.singleton;

public class PhoneService {

    private static PhoneService caller;

    private PhoneService() {
    }

    public static synchronized PhoneService getCaller() {
        if (caller == null)
            caller = new PhoneService();
        return caller;
    }

    public void call(String phoneNumber) {
        System.out.println("We call the number: " + phoneNumber);
    }
}
