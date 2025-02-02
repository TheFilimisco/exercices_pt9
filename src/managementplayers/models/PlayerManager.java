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
        players.add(player);
        System.out.println("Successful");
    }

    public void deletePlayer(String namePlayer){
        var notice = "";
        for (Player player: players){
            if (player.getName().equals(namePlayer)){
                players.remove(player);
                notice = "Successful";
                break;
            } else {
                notice = "Dont found";
            }
        }
        System.out.println(notice);
    }

    public Player getPlayer(String namePlayer){
        var newPlayer = new Player();
        for (Player player: players) {
            if (player.getName().equals(namePlayer)){
                newPlayer = player;
                break;
            } else {
                newPlayer = null;
            }
        }
        return newPlayer;
    }

    public Player setScorePlayer(String namePlayer, int newScorePlayer){
        var player = getPlayer(namePlayer);
        if (player==null){
            return null;
        }
        player.setScore(newScorePlayer);
        return player;
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
        } else {
            System.out.println("No players available.");
        }
    }


    public void getAllPlayers(){
        for (Player player: players)System.out.println(player);
    }

    public Comparator<Player> playerComparatorByScored = Comparator.comparingInt(Player::getScore);

}

