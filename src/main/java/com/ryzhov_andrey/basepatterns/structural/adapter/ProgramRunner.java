package src.main.java.com.ryzhov_andrey.basepatterns.structural.adapter;

public class ProgramRunner {
    public static void main(String[] args) {
        USB cardReader = new AdapterCardReader();
        cardReader.connectWithUsbCable();
    }
}
