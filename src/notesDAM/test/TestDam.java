package notesDAM.test;

import notesDAM.models.ManagementNoteGrade;

import java.util.Scanner;

public class TestDam {
    public static void main(String[] args) {
        ManagementNoteGrade managementNoteGrade = new ManagementNoteGrade();
        Scanner input = new Scanner(System.in);
        managementNoteGrade.inputValue(input);
    }

}
