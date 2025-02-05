package managementplayers.models;

import ships.models.Ship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayerManager {
    private ArrayList<Player> players;

    public PlayerManager(ArrayList<Player> players) {
        this.players = players;
    }

    public PlayerManager() {
        players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player){
        if (players.contains(player)){
            System.out.println("Don't possible");
            return;
        }
        players.add(player);
        System.out.println("Successful");
    }

    public void deletePlayer(String namePlayer){
        var newPlayer = players.removeIf( player -> player.getName().equals(namePlayer));
        var message = newPlayer ? "Removed: " + namePlayer : "Don't founded";
        System.out.println(message);
    }

    public Player getPlayer(String namePlayer){
        for (Player player: players){
            if (player.getName().equals(namePlayer)){
                return player;

            }
        }
        return null;
    }

    public void setScorePlayer(String namePlayer, int newScorePlayer){
        if (getPlayer(namePlayer)==null){
            System.out.println("Don't possible!");
            return;
        }
        getPlayer(namePlayer).setScore(newScorePlayer);
        System.out.println("Updated!: " + namePlayer);
    }


    public ArrayList<Player> getBestPlayers(int scoredRange){
        ArrayList<Player> bestPlayers = new ArrayList<>();
        for (Player player: players){
            if (player.getScore() > scoredRange){
                bestPlayers.add(player);
            }
        }
        return bestPlayers;
    }

    public ArrayList<Player> getPlayersByMinScored(int minScored){
        ArrayList<Player> minPlayers = new ArrayList<>();
        for (Player player: players){
            if (player.getScore() < minScored){
                minPlayers.add(player);
            }
        }
        return minPlayers;
    }

    public void getBestPlayer(){
        if (!players.isEmpty()) {
            Player bestPlayer = Collections.max(players, playerComparatorByScored);
            System.out.println("Best Player: " + bestPlayer);
            return;
        }
        System.out.println("No players available.");
    }


    public void getAllPlayers(){
        players.sort(playerComparatorByScored);
        for (Player player: players)System.out.println(player);
    }
    public Comparator<Player> playerComparatorByScored = Comparator.comparingInt(Player::getScore);

}

