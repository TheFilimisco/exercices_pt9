package managementplayers.test;

import managementplayers.models.Player;
import managementplayers.models.PlayerManager;

public class TestPlayerManager {


    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();
        playerManager.addPlayer(new Player("Ronaldo",150));
        playerManager.addPlayer(new Player("Messi",200));
        playerManager.addPlayer(new Player("Oscar",300));
        playerManager.addPlayer(new Player("Miguel",100));
        playerManager.addPlayer(new Player("David",700));
        playerManager.addPlayer(new Player("Luis",375));

        playerManager.deletePlayer("Ronaldo");
        playerManager.deletePlayer("Megan");

        playerManager.getAllPlayers();

        System.out.println(playerManager.getPlayer("Ronaldo"));
        System.out.println(playerManager.getPlayer("Messi"));


        System.out.println("==============");

        System.out.println(playerManager.setScorePlayer("Messi",10));

        playerManager.getAllPlayers();

        System.out.println("=========================");
        playerManager.getBestPlayer();

        System.out.println("==========================");
        System.out.println(playerManager.getBestPlayers(500));

        System.out.println("==========================");
        System.out.println(playerManager.getPlayersByMinScored(200));
        

    }
}
