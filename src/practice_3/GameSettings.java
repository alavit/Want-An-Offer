package practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
        currentPlayers = 1;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("Game name: " + this.gameName + ", Current players: " + currentPlayers + ", Max players: " + maxPlayers);
    }
}
