package footballteam.models;

import cellphones.models.CellPhone;

import java.util.*;

public class ManagementPlayers {
    private HashMap<Integer,Player> playersHashMap;

    public ManagementPlayers(HashMap<Integer, Player> playerHashMap) {
        this.playersHashMap = playerHashMap;
    }

    public ManagementPlayers() {
        playersHashMap = new HashMap<>();
    }

    public HashMap<Integer, Player> getPlayerHashMap() {
        return playersHashMap;
    }

    public void setPlayerHashMap(HashMap<Integer, Player> playerHashMap) {
        this.playersHashMap = playerHashMap;
    }

    public void addPlayer(Integer number, Player player){
        playersHashMap.put(number,player);
        System.out.println("Successfully");
    }

    public Player getPlayerByNumber(Integer number){
        return playersHashMap.get(number);
    }

    public Player getPlayerByName(String namePlayer){
        var player = new Player();
        player = null;
        for (Map.Entry<Integer, Player> item : playersHashMap.entrySet()){
            if (item.getValue().getName().equals(namePlayer)){
                player= item.getValue();
                break;
            }
        }
        return player;
    }

    public void showAllPlayers(){
        playersHashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void showAllPlayerByAge(){
        List<Map.Entry<Integer, Player>> newListPlayers = new ArrayList<>(playersHashMap.entrySet());
        newListPlayers.sort(Comparator.comparing(entry-> entry.getValue().getAge()));
        for (Map.Entry<Integer, Player> entry : newListPlayers) {
            System.out.println(entry.getValue());
        }
    }

    public void showAllPlayersByPosition(){
        List<Map.Entry<Integer, Player>> newListPlayers = new ArrayList<>(playersHashMap.entrySet());

        newListPlayers.sort(Comparator.comparing(entry-> entry.getValue().getPosition()));
        for (Map.Entry<Integer, Player> entry : newListPlayers) {
            System.out.println(entry.getValue());
        }

    }
}
