package cellphones.test;

import cellphones.models.CellPhone;
import cellphones.models.ManagementCellphones;

public class TestManagementCellphones {

    public static void main(String[] args) {
        ManagementCellphones managementCellphones = new ManagementCellphones();

        System.out.println("============Add=============");
        managementCellphones.addCellPhone("54910978L", new CellPhone("Samsung","A70", 999999999));
        managementCellphones.addCellPhone("54910978L", new CellPhone("Iphone","15proMax", 999999999));
        managementCellphones.addCellPhone("54910977L", new CellPhone("Xiaomi","LT90", 999999998));
        managementCellphones.addCellPhone("54910976L", new CellPhone("Xiaomi","LT90", 999999992));
        System.out.println("===========Show All Cellphones========");
        managementCellphones.showAllCellPhones();
        System.out.println("=============Get a Cellphone by DNI================= ");
        System.out.println(managementCellphones.getCellPhoneByDNI("54910977L"));
        System.out.println("=============Delete a Cellphone by DNI================= ");
        managementCellphones.deleteCellPhone("54910977L");
        managementCellphones.showAllCellPhones();
        System.out.println("=============Get a Cellphone by CellPhone================= ");
        managementCellphones.getDNIByCellPhone(999999992);




    }
}
