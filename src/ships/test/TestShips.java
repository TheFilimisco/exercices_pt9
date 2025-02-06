package ships.test;

import ships.models.ManagementShips;
import ships.models.Ship;

import java.util.Scanner;

public class TestShips {

    public static void main(String[] args) {
        ManagementShips managementShips = new ManagementShips();
        Scanner input = new Scanner(System.in);

        managementShips.addNewShip(new Ship("La Consentida",30000,4));
        managementShips.addNewShip(new Ship("La Consentida",50000,4));
        managementShips.addNewShip(new Ship("La El Buen Marino",50000,10));
        managementShips.addNewShip(new Ship("Terrible Emperador",22200,2));
        managementShips.addNewShip(new Ship("Olvidable",50000,1));

        var running = true;
        while (running){

            System.out.println("""
                    ==========================================
                    1. Add new Ship
                    2. Search a Ship
                    3. Modifying a ship
                    4. Get a Ship
                    5. Get all Ships
                    6. Get Ships by old
                    7. Get Ships by Lexicographic
                    8. Leave
                    ==========================================
                    """);
            System.out.print("Put your option: ");
            var option = input.nextInt();

            switch (option){
                case 1:
                    input.nextLine();
                    System.out.print("Enter name: ");
                    var newName = input.nextLine();
                    System.out.print("Enter price: ");
                    var newPrice = input.nextDouble();
                    System.out.print("Enter your Old: ");
                    var newOld = input.nextInt();
                    managementShips.addNewShip(new Ship(newName,newPrice,newOld));
                    break;
                case 2:
                    input.nextLine();
                    managementShips.searchShip(input);
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Enter your id: ");
                    var idShip = input.nextInt();
                    managementShips.updateShip(idShip,input);
                    break;
                case 4:
                    input.nextLine();
                    System.out.print("Enter your id: ");
                    var identifierShip = input.nextInt();
                    System.out.println(managementShips.getShip(identifierShip));
                    break;
                case 5:
                    managementShips.getAllShips();
                    break;
                case 6:
                    managementShips.getAllShipsByOld();
                    break;
                case 7:
                    managementShips.getAllShipsByLexicographic();
                    break;
                case 8:
                    running = false;
                default:
                    System.out.println("Please do write right option!");
            }
        }
    }
}
