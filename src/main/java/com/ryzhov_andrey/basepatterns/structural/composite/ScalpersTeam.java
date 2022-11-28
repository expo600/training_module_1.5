package src.main.java.com.ryzhov_andrey.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ScalpersTeam {
    private List<Scalper> scalpers = new ArrayList<>();

    public void addScalper(Scalper scalper) {
        scalpers.add(scalper);
    }

    public void removeScalper(Scalper scalper) {
        scalpers.remove(scalper);
    }

    public void startTrading() {
        System.out.println("ScalpersTeam start scalping ...");
        for (Scalper scalper : scalpers) {
            scalper.scalpCrypto();
        }
    }
}
