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
        if (playersHashMap.containsKey(number)){
            System.out.println("This player's number exist!");
            return;
        }
        playersHashMap.put(number,player);
        System.out.println("Successfully");
    }

    public Player getPlayerByNumber(Integer number){
        if (!playersHashMap.containsKey(number)){
            System.out.println("This player's number not exist!");
            return null;
        }
        System.out.println(playersHashMap.get(number));
        return playersHashMap.get(number);
    }

    public void getPlayersByName(String namePlayer){
        var listPlayer = new ArrayList<Player>();
        for (Map.Entry<Integer, Player> item : playersHashMap.entrySet()){
            if (item.getValue().getName().equals(namePlayer)){
                listPlayer.add(item.getValue());
            }
        }
        if (listPlayer.isEmpty()){
            System.out.println("Not exist player: " + namePlayer);
        }
        listPlayer.forEach(System.out::println);

    }

    public void showAllPlayers(){
        List<Map.Entry<Integer, Player>> newListPlayers = new ArrayList<>(playersHashMap.entrySet());
        newListPlayers.sort(Map.Entry.comparingByKey());
        for (Map.Entry<Integer, Player> entry : newListPlayers) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

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
