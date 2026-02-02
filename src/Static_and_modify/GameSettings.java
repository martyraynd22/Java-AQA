package Static_and_modify;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName,int currentPlayers){
        this.currentPlayers = currentPlayers;
        this.gameName = gameName;
    }
    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }
    void  addPlayer() {
        if (currentPlayers < maxPlayers) {
            this.currentPlayers++;
            System.out.println("Добавление игрока допускаемо");
        } else {
            System.out.println("Лимит игроков превышен");
        }
    }
            void printGameStatus(){
                System.out.println("Название: " + gameName + " Текущее количество игроков: " + currentPlayers+ " Максимальное количество игроков: " + maxPlayers);
        }
    }



