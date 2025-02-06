package scrumhashmap.test;

import scrumhashmap.models.Scrum;
import scrumhashmap.models.Student;

import java.util.Scanner;

public class TestScrum {
    public static void main(String[] args) {
        Scrum scrum = new Scrum();
        Scanner input = new Scanner(System.in);

        System.out.println(scrum.addStudent("X001",new Student("S002","Steven1")));
        System.out.println(scrum.addStudent("X002",new Student("S003","Steven2")));
        System.out.println(scrum.addStudent("X003",new Student("S001","Steven4")));
        System.out.println(scrum.addStudent("X003",new Student("S001","Steven4")));
        System.out.println(scrum.addStudent("X004",new Student("S001","Steven4")));
        System.out.println(scrum.addStudent("X004",new Student("S013","Eugenio")));
        System.out.println(scrum.addStudent("X004",new Student("S015","Eugenio")));

//        System.out.println("=================Add Project====================");
//        System.out.println(scrum.addProject("X001"));
//        System.out.println(scrum.addProject("X001"));
//
//        System.out.println("=======================Show Projects=================");
//        scrum.showProjects();
//        System.out.println("========================Add Student==================");
//        System.out.println(scrum.addStudent("X001",new Student("S002","Steven1")));
//        System.out.println(scrum.addStudent("X002",new Student("S003","Steven2")));
//        System.out.println(scrum.addStudent("X003",new Student("S001","Steven4")));
//        System.out.println(scrum.addStudent("X003",new Student("S001","Steven4")));
//        System.out.println(scrum.addStudent("X004",new Student("S001","Steven4")));
//
//        System.out.println("=======================Show Projects=================");
//        scrum.showProjects();
//
//        System.out.println("=====================Remove projects==================");
//        System.out.println(scrum.removeProject("X003"));
//        System.out.println(scrum.removeProject("X006"));
//
//        System.out.println("=======================Show Projects=================");
//        scrum.showProjects();
//
//        System.out.println("=====================Remove Student==================");
//        System.out.println(scrum.removeStudent("X001", "S002"));
//        System.out.println(scrum.removeStudent("X001", "S006"));
//        scrum.showProjects();

        var running = true;
        while (running){
            System.out.println("""
                    ==========================================
                    1. Add new Project Scrum
                    2. Add new Student
                    3. Delete Project
                    4. Delete a Student
                    5. Show All Projects
                    6. Leave
                    ==========================================
                    """);
            System.out.print("Put your option: ");
            var option = input.nextInt();

            switch (option){
                case 1:
                    input.nextLine();
                    System.out.println("==============Add new Project Scrum==============");
                    System.out.print("Enter new project's name: ");
                    var inputNewProjectName = input.nextLine();
                    scrum.addProject(inputNewProjectName);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("==============Add new Student==============");
                    System.out.print("Enter project's name: ");
                    var nameProject = input.nextLine();
                    System.out.print("Enter id's student: ");
                    var idStudent = input.nextLine();
                    System.out.print("Enter name's student: ");
                    var nameStudent = input.nextLine();
                    scrum.addStudent(nameProject,new Student(idStudent,nameStudent));
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("==============Delete Project==============");
                    System.out.print("Enter project's name: ");
                    var inputNameProjectDelete = input.nextLine();
                    scrum.removeProject(inputNameProjectDelete);
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("==============Delete a Student==============");
                    System.out.print("Enter project's name: ");
                    var projectNameStudent = input.nextLine();
                    System.out.print("Enter name's Student: ");
                    var nameStudentDelete = input.nextLine();
                    scrum.removeStudent(projectNameStudent,nameStudentDelete);
                    break;
                case 5:
                    System.out.println("==============Show All Projects==============");
                    scrum.showProjects();
                    break;
                case 6:
                    running = false;
                default:
                    System.out.println("Please do write right option!");
            }
        }






    }
}
