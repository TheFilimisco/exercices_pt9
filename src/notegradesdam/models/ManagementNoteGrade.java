package notegradesdam.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManagementNoteGrade {
    private ArrayList<Student> students;

    public ManagementNoteGrade() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void inputValue(Scanner inputNoteGrade){
        System.out.println("Enter your Note Grade: ");
        int newNoteGrade = inputNoteGrade.nextInt();
        while (newNoteGrade!=-1){
            students.add(new Student(newNoteGrade));
            System.out.println("Enter your Note Grade: ");
            newNoteGrade = inputNoteGrade.nextInt();
        }
        System.out.println(getAVG());
    }

    private int getSumValues(){
        int sumTotal = 0;
        for (Student student: students){
            sumTotal+= (int) student.getNote_grade();
        }
        return sumTotal;
    }

    private int getAVG(){
        return getSumValues()/students.size();
    }



    @Override
    public String toString() {
        return "ManagementNoteGrade{" +
                "students=" + students +
                '}';
    }
}
