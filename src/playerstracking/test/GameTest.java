package playerstracking.test;

import playerstracking.models.Game;
import playerstracking.models.Player;

public class GameTest {
    public static void main(String[] args) {
        Game game = new Game();
        // Add 5 Police
        game.addPlayer(new Player("Police1", Player.Role.Police));
        game.addPlayer(new Player("Police2", Player.Role.Police));
        game.addPlayer(new Player("Police3", Player.Role.Police));
        game.addPlayer(new Player("Police4", Player.Role.Police));
        game.addPlayer(new Player("Police5", Player.Role.Police));
        // Add 5 Thief
        game.addPlayer(new Player("Thief1", Player.Role.Thief));
        game.addPlayer(new Player("Thief2", Player.Role.Thief));
        game.addPlayer(new Player("Thief3", Player.Role.Thief));
        game.addPlayer(new Player("Thief4", Player.Role.Thief));
        game.addPlayer(new Player("Thief5", Player.Role.Thief));


        //Delete Players
        game.deletePlayer("Thief1");
        game.deletePlayer("Thief2");
        game.deletePlayer("Thief3");
        game.deletePlayer("Thief4");
        game.deletePlayer("Police2");
        game.deletePlayer("Police1");

        //CheckGame
        game.checkGameStatus();


        //ShowPlayers
        game.showAllPlayers();


    }
}
