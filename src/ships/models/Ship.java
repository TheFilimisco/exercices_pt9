package ships.models;

import java.util.Comparator;

public class Ship {
    private int identifiedShip;
    private String nameShip;
    private double priceShip;
    private int oldShip;
    private static int counterShip= 0;

    public Ship() {
    }

    public Ship(String nameShip, double priceShip, int oldShip) {
        identifiedShip = counterShip++;
        this.nameShip = nameShip;
        this.priceShip = priceShip;
        this.oldShip = oldShip;
    }


    public int getIdentifiedShip() {
        return identifiedShip;
    }

    public void setIdentifiedShip(int identifiedShip) {
        this.identifiedShip = identifiedShip;
    }

    public String getNameShip() {
        return nameShip;
    }

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public double getPriceShip() {
        return priceShip;
    }

    public void setPriceShip(double priceShip) {
        this.priceShip = priceShip;
    }

    public int getOldShip() {
        return oldShip;
    }

    public void setOldShip(int oldShip) {
        this.oldShip = oldShip;
    }

    public static Comparator<Ship> shipComparatorByOld = new Comparator<Ship>() {
        @Override
        public int compare(Ship a1, Ship a2) {
            return Integer.compare(a1.getOldShip(), a2.getOldShip());
        }
    };

    public static Comparator<Ship> shipComparatorById = new Comparator<Ship>() {
        @Override
        public int compare(Ship a1, Ship a2) {
            return Integer.compare(a1.getIdentifiedShip(), a2.getIdentifiedShip());
        }
    };

    public static Comparator<Ship> shipComparatorByName = new Comparator<Ship>() {
        @Override
        public int compare(Ship a1, Ship a2) {
            return CharSequence.compare(a1.getNameShip(), a2.getNameShip());
        }
    };

    public static Comparator<Ship> shipComparatorByPrice = new Comparator<Ship>() {
        @Override
        public int compare(Ship a1, Ship a2) {
            return Double.compare(a1.getPriceShip(), a2.getPriceShip());
        }
    };

    @Override
    public String toString() {
        return "Ship{" +
                "id='" + identifiedShip + '\'' +
                "nameShip='" + nameShip + '\'' +
                ", priceShip=" + priceShip +
                ", oldShip=" + oldShip +
                '}';
    }
}
