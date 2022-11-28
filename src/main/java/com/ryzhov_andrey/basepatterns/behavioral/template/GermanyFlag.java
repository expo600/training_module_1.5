package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.template;

public class GermanyFlag extends AbstractFlag{
    @Override
    void drawUpperLevel() {
        System.out.println("Draw black line ...");
    }

    @Override
    void drawMiddleLevel() {
        System.out.println("Draw red line ...");
    }

    @Override
    void drawBottomLevel() {
        System.out.println("Draw yellow line ...");
    }
}
