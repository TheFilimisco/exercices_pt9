package ships.models;

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
