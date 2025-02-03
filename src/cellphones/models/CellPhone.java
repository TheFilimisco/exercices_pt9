package cellphones.models;

import java.util.HashMap;

public class CellPhone {
    private String brand;
    private String model;
    private long number;

    public CellPhone(String brand, String model, long number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", number=" + number +
                '}';
    }
}
