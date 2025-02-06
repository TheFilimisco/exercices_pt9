package managementenrollment.test;

import footballteam.models.Player;
import managementenrollment.models.CourseManager;
import managementenrollment.models.Student;

import java.util.Scanner;

public class TestCourseManager {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        Scanner input = new Scanner(System.in);

        courseManager.enrollmentStudent(new Student("X002","Steven",55));
        courseManager.enrollmentStudent(new Student("X004","Steven",24));
        courseManager.enrollmentStudent(new Student("X003","Steven",12));
        courseManager.enrollmentStudent(new Student("X001","Steven",35));
        courseManager.enrollmentStudent(new Student("X005","Steven",25));

        var running = true;
        while (running){
            System.out.println("""
                    ==========================================
                    1. Add new Enrollment
                    2. Delete a Enrollment by Id
                    3. Get a Enrollment by Id
                    4. Show Enrollments
                    5. Leave
                    ==========================================
                    """);
            System.out.print("Put your option: ");
            var option = input.nextInt();

            switch (option){
                case 1:
                    input.nextLine();
                    System.out.println("==============Add new Student==============");
                    System.out.print("Enter new idStudent: ");
                    var inputNewId = input.nextLine();
                    System.out.print("Enter new Name: ");
                    var inputNewName = input.nextLine();
                    System.out.println("Enter new Age: ");
                    var inputNewPosition= input.nextInt();
                    courseManager.enrollmentStudent(new Student(inputNewId,inputNewName,inputNewPosition));
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("==============Delete a Enrollment==============");
                    System.out.print("Enter id: ");
                    var inputIdEnrollment = input.nextLine();
                    courseManager.removeStudentById(inputIdEnrollment);
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("==============Get an Enrollment==============");
                    System.out.print("Enter your id: ");
                    var inputIdGetEnrollment = input.nextLine();
                    courseManager.findStudentById(inputIdGetEnrollment);
                    break;
                case 4:
                    System.out.println("==============Show All Enrollments==============");
                    courseManager.showAllStudents();
                    break;
                case 5:
                    running = false;
                default:
                    System.out.println("Please do write right option!");
            }
        }


    }
}
