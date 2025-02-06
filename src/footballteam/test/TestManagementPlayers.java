package footballteam.test;

import cellphones.models.CellPhone;
import footballteam.models.ManagementPlayers;
import footballteam.models.Player;

import java.util.Scanner;

public class TestManagementPlayers {
    public static void main(String[] args) {
        ManagementPlayers  managementPlayers = new ManagementPlayers();
        Scanner input = new Scanner(System.in);

        managementPlayers.addPlayer(15, new Player("Joaquin",23,"Forward"));
        managementPlayers.addPlayer(2, new Player("Luis",21,"Midfielder"));
        managementPlayers.addPlayer(3, new Player("Ramon",21,"Defender"));
        managementPlayers.addPlayer(100, new Player("Ramon",21,"Defender"));
        managementPlayers.addPlayer(60, new Player("Ramon",20,"Midfielder"));
        managementPlayers.addPlayer(30, new Player("Ramon",21,"Forward"));

        var running = true;
        while (running){
            System.out.println("""
                    ==========================================
                    1. Add new Player
                    2. Get a Player by Number
                    3. Get a Players by Name
                    4. Show All Player by Number
                    5. Show All Player by Age
                    6. Show All Player by Position
                    7. Leave
                    ==========================================
                    """);
            System.out.print("Put your option: ");
            var option = input.nextInt();

            switch (option){
                case 1:
                    input.nextLine();
                    System.out.println("==============Add new Player==============");
                    System.out.print("Enter new Number: ");
                    var inputNewNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter new Name: ");
                    var inputNewName = input.nextLine();
                    System.out.println("Enter new Position: ");
                    var inputNewPosition= input.nextLine();
                    System.out.println("Enter new Age: ");
                    var inputNewAge = input.nextInt();
                    managementPlayers.addPlayer(inputNewNumber,new Player(inputNewName,inputNewAge,inputNewPosition));
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("==============Get a Player by Number==============");
                    System.out.print("Enter number: ");
                    var inputNumber = input.nextInt();
                    managementPlayers.getPlayerByNumber(inputNumber);
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("==============Get a Players by Name==============");
                    System.out.print("Enter name: ");
                    var inputName = input.nextLine();
                    managementPlayers.getPlayersByName(inputName);
                    break;
                case 4:
                    System.out.println("==============Show All Players By Number==============");
                    managementPlayers.showAllPlayers();
                    break;
                case 5:
                    System.out.println("==============Show All Players By Age==============");
                    managementPlayers.showAllPlayerByAge();
                    break;
                case 6:
                    System.out.println("==============Show All Players By Position==============");
                    managementPlayers.showAllPlayersByPosition();
                    break;
                case 7:
                    running = false;
                default:
                    System.out.println("Please do write right option!");
            }
        }



    }
}
