package footballteam.test;

import footballteam.models.ManagementPlayers;
import footballteam.models.Player;

public class TestManagementPlayers {
    public static void main(String[] args) {
        ManagementPlayers  managementPlayers = new ManagementPlayers();
        managementPlayers.addPlayer(1, new Player("Joaquin",23,"Forward"));
        managementPlayers.addPlayer(2, new Player("Luis",21,"Midfielder"));
        managementPlayers.addPlayer(3, new Player("Ramon",21,"Defender"));
        managementPlayers.addPlayer(3, new Player("Ramon",21,"Defender"));

        System.out.println("==============Show All Players=======");
        managementPlayers.showAllPlayers();

        System.out.println("==============Get a Player by Number ============");
        System.out.println(managementPlayers.getPlayerByNumber(1));

        System.out.println("==============Get a Player By Name");
        System.out.println(managementPlayers.getPlayerByName("Ramon"));

        System.out.println("==============Get All Players By Age===============");
        managementPlayers.showAllPlayerByAge();

        System.out.println("==============Get All Players By Name===============");
        managementPlayers.showAllPlayersByPosition();



    }
}
