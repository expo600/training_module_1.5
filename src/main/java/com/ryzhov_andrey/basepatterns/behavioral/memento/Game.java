package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.memento;

import java.util.Date;

public class Game {
    private String level;
    private Date date;

    public void setLevelAndDate(String level) {
        this.level = level;
        this.date = new Date();
    }

    public SaveGame saveGame() {
        return new SaveGame(level);
    }

    public void loadGame(SaveGame saveGame) {
        level = saveGame.getLevel();
        date = saveGame.getDate();

    }

    @Override
    public String toString() {
        return "Level: " + level +
                "\ndate: " + date + "\n";
    }
}
