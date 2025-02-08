package playerstracking.models;

import java.util.HashSet;

public class Game {
    private HashSet<Player> activePlayers;
    private HashSet<Player> eliminatedPlayers;

    public Game(HashSet<Player> activePlayers, HashSet<Player> eliminatedPlayers) {
        this.activePlayers = activePlayers;
        this.eliminatedPlayers = eliminatedPlayers;
    }

    public Game() {
        activePlayers = new HashSet<>();
        eliminatedPlayers = new HashSet<>();
    }

    public HashSet<Player> getActivePlayers() {
        return activePlayers;
    }

    public void setActivePlayers(HashSet<Player> activePlayers) {
        this.activePlayers = activePlayers;
    }

    public HashSet<Player> getEliminatedPlayers() {
        return eliminatedPlayers;
    }

    public void setEliminatedPlayers(HashSet<Player> eliminatedPlayers) {
        this.eliminatedPlayers = eliminatedPlayers;
    }

    public boolean addPlayer(Player player){
        if (activePlayers.contains(player)){
            System.out.println("This player exist: " + player);
            return false;
        }
        activePlayers.add(player);
        return true;
    }

    public boolean deletePlayer(String name){
        for (Player player: activePlayers){
            if (player.getName().equals(name)){
                eliminatedPlayers.add(player);
                activePlayers.remove(player);
                return true;
            }
        }
        return false;
    }

    public void checkGameStatus() {
        var counterPolice = 0;
        var counterThief = 0;
        for (Player player :activePlayers){
            if (player.getRole().equals(Player.Role.Police)){
                counterPolice++;
            }
            if (player.getRole().equals(Player.Role.Thief)){
                counterThief++;
            }
        }
        if (counterThief==0){
            System.out.println("Win Polices");
        } else if (counterPolice==0) {
            System.out.println("Win Thief");
        } else {
            System.out.println("Still Alive both groups");
        }
    }

    public void showAllPlayers(){
        System.out.println("===========Active Players=========");
        activePlayers.forEach(System.out::println);
        System.out.println("===========Eliminated Players=========");
        eliminatedPlayers.forEach(System.out::println);
    }



}
