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
        var getShipByArray = new Ship();
        for (Ship ship : ships){
            if (ship.getIdentifiedShip() == id){
                getShipByArray = ship;
                break;
            } else {
                getShipByArray = null;
            }
        }
        return getShipByArray;
    }

    public void getAllShips(){
        ships.sort(shipComparatorById);
        for (Ship ship : ships) System.out.println(ship);
    }

    public void getAllShipsByOld(){
        ships.sort(shipComparatorByOld);
        for (Ship ship : ships) System.out.println(ship);
    }

    public void getAllShipsByLexicographic(){
        ships.sort(shipComparatorByName.thenComparing(shipComparatorByPrice));
        for (Ship ship : ships) System.out.println(ship);
    }


    public Comparator<Ship> shipComparatorByOld = new Comparator<Ship>() {
        @Override
        public int compare(Ship a1, Ship a2) {
            return Integer.compare(a1.getOldShip(), a2.getOldShip());
        }
    };

    public Comparator<Ship> shipComparatorById = new Comparator<Ship>() {
        @Override
        public int compare(Ship a1, Ship a2) {
            return Integer.compare(a1.getIdentifiedShip(), a2.getIdentifiedShip());
        }
    };

    public Comparator<Ship> shipComparatorByName = new Comparator<Ship>() {
        @Override
        public int compare(Ship a1, Ship a2) {
            return CharSequence.compare(a1.getNameShip(), a2.getNameShip());
        }
    };

    public Comparator<Ship> shipComparatorByPrice = new Comparator<Ship>() {
        @Override
        public int compare(Ship a1, Ship a2) {
            return Double.compare(a1.getPriceShip(), a2.getPriceShip());
        }
    };

    @Override
    public String toString() {
        return "ManagementShips{" +
                "ships=" + ships +
                '}';
    }


}
