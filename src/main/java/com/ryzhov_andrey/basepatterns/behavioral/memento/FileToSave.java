package src.main.java.com.ryzhov_andrey.basepatterns.behavioral.memento;

public class FileToSave {
    private SaveGame saveGame;

    public SaveGame getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(SaveGame saveGame) {
        this.saveGame = saveGame;
    }
}
