package src.main.java.com.ryzhov_andrey.basepatterns.creational.abstractfactory;

public interface GUIFactory {
    Button getButton();
    Icon getIcon();
    Menu getMenu();
}
