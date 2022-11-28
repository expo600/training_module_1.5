package src.main.java.com.ryzhov_andrey.basepatterns.structural.adapter;

public class AdapterCardReader extends MemoryCard implements USB {

    @Override
    public void connectWithUsbCable() {
        insert();
        copyDate();
    }
}
