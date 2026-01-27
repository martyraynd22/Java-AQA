package Static_and_modify;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(int currentPlayers, String gameName){
        this.currentPlayers = currentPlayers;
        this.gameName = gameName;
    }

    static void setMaxPlayers(int newMaxPlayers){
       maxPlayers = newMaxPlayers;
    }

    void addPlayer(){
        if (currentPlayers < maxPlayers) {
            this.currentPlayers ++;
            System.out.println("Добавление игроков допустимо");
        }
        else {
            System.out.println("Количество игроков превышает допустимый максимум");
        }
    }

    void printGameStatus(){
        System.out.println("Название игры: " + gameName + ", Текущих игроков: " + currentPlayers + ", Максимальное количество игроков: " + maxPlayers);
    }
}
