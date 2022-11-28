package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.memento;

import java.util.Date;

public class SaveGame {
    private final String level;
    private final Date date;

    public SaveGame(String level) {
        this.level = level;
        this.date = new Date();
    }

    public String getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }
}
