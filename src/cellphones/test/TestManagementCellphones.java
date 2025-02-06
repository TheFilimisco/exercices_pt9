package cellphones.test;

import cellphones.models.CellPhone;
import cellphones.models.ManagementCellphones;
import ships.models.Ship;

import java.util.Scanner;

public class TestManagementCellphones {

    public static void main(String[] args) {
        ManagementCellphones managementCellphones = new ManagementCellphones();
        Scanner input = new Scanner(System.in);

        managementCellphones.addCellPhone("54910978L", new CellPhone("Samsung","A70", 999999999));
        managementCellphones.addCellPhone("54910978L", new CellPhone("Iphone","15proMax", 999999999));
        managementCellphones.addCellPhone("54910977L", new CellPhone("Xiaomi","LT90", 999999998));
        managementCellphones.addCellPhone("54910976L", new CellPhone("Xiaomi","LT90", 999999992));

        var running = true;
        while (running){

            System.out.println("""
                    ==========================================
                    1. Add new CellPhone
                    2. Delete a CellPhone
                    3. Get a CellPhone by DNI
                    4. Get a DNI by cellphone's number
                    5. Show All Cellphones
                    6. Leave
                    ==========================================
                    """);
            System.out.print("Put your option: ");
            var option = input.nextInt();

            switch (option){
                case 1:
                    input.nextLine();
                    System.out.println("==============Add new CellPhone==============");
                    System.out.print("Enter DNI: ");
                    var newDNI = input.nextLine();
                    System.out.print("Enter brand: ");
                    var newBrand = input.nextLine();
                    System.out.print("Enter model: ");
                    var newModel = input.nextLine();
                    System.out.print("Enter your number: ");
                    var newNumber = input.nextInt();
                    managementCellphones.addCellPhone(newDNI,new CellPhone(newBrand,newModel,newNumber));
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("==============Delete a CellPhone==============");
                    System.out.print("Enter DNI: ");
                    var inputDniDelete = input.nextLine();
                    managementCellphones.deleteCellPhone(inputDniDelete);
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("==============Get a CellPhone by DNI==============");
                    System.out.print("Enter DNI: ");
                    var inputGetDni = input.nextLine();
                    managementCellphones.getCellPhoneByDNI(inputGetDni);
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("==============Get a DNI by cellphone's number==============");
                    System.out.print("Enter your number: ");
                    var inputNumber = input.nextLong();
                    managementCellphones.getDNIByCellPhone(inputNumber);
                    break;
                case 5:
                    System.out.println("==============Show All Cellphones==============");
                    managementCellphones.showAllCellPhones();
                    break;
                case 6:
                    running = false;
                default:
                    System.out.println("Please do write right option!");
            }
        }




    }
}
