package ships.models;

import java.util.*;



public class ManagementShips {
    private ArrayList<Ship> ships;

    public ManagementShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public ManagementShips() {
        ships = new ArrayList<>();
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }


    public void addNewShip(String name, double price, int old){
        var newShip = new Ship(name,price,old);
        ships.add(newShip);
        System.out.println("Successful");
    }

    public void searchShip(Scanner inputSearch){
        while (true){
            System.out.println("Search Ship (write 'exit' for leave: ");
            String inputName = inputSearch.nextLine().toLowerCase();
            if (inputName.equals("exit")){
                break;
            }
            System.out.println("\nSearch: \n");
            for (Ship ship:ships) if (ship.getNameShip().toLowerCase().trim().contains(inputName.toLowerCase().trim())){
                System.out.println(ship);
            }
        }
    }

    public void updateShip(int inputSearch, Scanner inputText){
        var ship = getShip(inputSearch);
        if (ship == null){
            System.out.println("Don't exist that id!");
        } else {
            inputText.nextLine();
            System.out.print("Enter new Name:");
            ship.setNameShip(inputText.nextLine());
            System.out.print("Enter new Price:");
            ship.setPriceShip(inputText.nextDouble());
            System.out.println("Enter new Old: ");
            ship.setOldShip(inputText.nextInt());
            System.out.println("Successful");
        }

    }

    public Ship getShip(int id){
        for (Ship ship : ships){
            if (ship.getIdentifiedShip() == id){
                return ship;
            }
        }
        return null;
    }

    public void getAllShips(){
        ships.sort(Ship.shipComparatorById);
        for (Ship ship : ships) System.out.println(ship);
    }

    public void getAllShipsByOld(){
        ships.sort(Ship.shipComparatorByOld);
        for (Ship ship : ships) System.out.println(ship);
    }

    public void getAllShipsByLexicographic(){
        ships.sort(Ship.shipComparatorByName.thenComparing(Ship.shipComparatorByPrice));
        for (Ship ship : ships) System.out.println(ship);
    }



    @Override
    public String toString() {
        return "ManagementShips{" +
                "ships=" + ships +
                '}';
    }


}
