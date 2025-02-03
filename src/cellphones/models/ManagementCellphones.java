package cellphones.models;

import java.util.HashMap;
import java.util.Map;

public class ManagementCellphones {
    private HashMap<String,CellPhone> cellPhoneHashMap;

    public ManagementCellphones(HashMap<String, CellPhone> cellPhoneHashMap) {
        this.cellPhoneHashMap = cellPhoneHashMap;
    }

    public ManagementCellphones() {
        cellPhoneHashMap = new HashMap<>();
    }

    public HashMap<String, CellPhone> getCellPhoneHashMap() {
        return cellPhoneHashMap;
    }

    public void setCellPhoneHashMap(HashMap<String, CellPhone> cellPhoneHashMap) {
        this.cellPhoneHashMap = cellPhoneHashMap;
    }

    public void addCellPhone(String DNI, CellPhone cellPhone){
        cellPhoneHashMap.put(DNI,cellPhone);
        System.out.println("Successfully...");
    }

    public void deleteCellPhone(String DNI){
        cellPhoneHashMap.remove(DNI);
        System.out.println("Deleted...");
    }

    public CellPhone getCellPhoneByDNI(String DNI) {
        return cellPhoneHashMap.get(DNI);
    }

    public void getDNIByCellPhone(long numberCellPhone){
        for (Map.Entry<String,CellPhone> item : cellPhoneHashMap.entrySet()){
            if (item.getValue().getNumber()==numberCellPhone){
                System.out.println("DNI is: " + item.getKey());
                break;
            }
        }
    }

    public void showAllCellPhones(){
        cellPhoneHashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }










}
