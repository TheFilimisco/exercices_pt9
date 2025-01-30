package notegradesdam.test;

import notegradesdam.models.ManagementNoteGrade;
import notegradesdam.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDam {
    public static void main(String[] args) {
        ManagementNoteGrade managementNoteGrade = new ManagementNoteGrade();
        Scanner input = new Scanner(System.in);
        managementNoteGrade.inputValue(input);
    }

}
