package src.main.java.com.ryzhov_andrey.basepatterns.creational.builder;

public class Car {
    private Name name;
    private Color color;
    private int price;

    public void setName(Name name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
