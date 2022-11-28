package src.main.java.com.ryzhov_andrey.basepatterns.structural.bridge;

public abstract class Scalp {
    protected Scalper scalper;

    public Scalp(Scalper scalper) {
        this.scalper = scalper;
    }
    public abstract void scalperScalp();
}
