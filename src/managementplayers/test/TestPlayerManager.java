package managementplayers.test;

import managementplayers.models.Player;
import managementplayers.models.PlayerManager;

import java.util.Scanner;

public class TestPlayerManager {


    public static void main(String[] args) {

        PlayerManager playerManager = new PlayerManager();
        Scanner input = new Scanner(System.in);

        playerManager.addPlayer(new Player("Ronaldo",150));
        playerManager.addPlayer(new Player("Messi",200));
        playerManager.addPlayer(new Player("Oscar",300));
        playerManager.addPlayer(new Player("Miguel",100));
        playerManager.addPlayer(new Player("David",700));
        playerManager.addPlayer(new Player("Luis",375));

        var running = true;

        while (running){

            System.out.println("""
                    ==========================================
                    1. Add new Player
                    2. Delete Player
                    3. Get a Player by Name
                    4. Update Player's Scored
                    5. Get N best player's list by Scored
                    6. Get best player's list by Scored that MinNumber
                    7. Get Ships by Lexicographic
                    8. Get Player best Scored
                    9. Show All Players
                    10. Leave
                    ==========================================
                    """);
            System.out.print("Put your option: ");
            var option = input.nextInt();
            switch (option){
                case 1:
                    input.nextLine();
                    System.out.println("===========Add new Player=============");
                    System.out.print("Enter name: ");
                    var newName = input.nextLine();
                    System.out.print("Enter your Scored: ");
                    var newScored = input.nextInt();
                    playerManager.addPlayer(new Player(newName,newScored));
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("===========Delete Player=============");
                    System.out.print("Enter name: ");
                    var inputName = input.nextLine();
                    playerManager.deletePlayer(inputName);
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("===========Get a Player by Name=============");
                    System.out.print("Enter your name: ");
                    var inputNameGet = input.nextLine();
                    playerManager.getPlayer(inputNameGet);
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("===========Update Player Record=============");
                    System.out.print("Enter name: ");
                    var inputNameUpdate = input.nextLine();
                    System.out.print("Enter your Scored: ");
                    var inputRecordUpdate = input.nextInt();
                    playerManager.setScorePlayer(inputNameUpdate,inputRecordUpdate);
                    break;
                case 9:
                    System.out.println("===========Show All Players=============");
                    playerManager.getAllPlayers();
                    break;
                case 10:
                    running = false;
                default:
                    System.out.println("Please do write right option!");
            }
        }
        

    }
}
