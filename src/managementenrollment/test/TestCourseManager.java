package managementenrollment.test;

import managementenrollment.models.CourseManager;
import managementenrollment.models.Student;

public class TestCourseManager {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        System.out.println("=================Enrollment Student==============");
        courseManager.enrollmentStudent(new Student("X002","Steven",55));
        courseManager.enrollmentStudent(new Student("X004","Steven",24));
        courseManager.enrollmentStudent(new Student("X003","Steven",12));
        courseManager.enrollmentStudent(new Student("X001","Steven",35));
        courseManager.enrollmentStudent(new Student("X005","Steven",25));

        System.out.println("=================Show All Students==============");
        courseManager.showAllStudents();
        System.out.println("==================Remove Student by Id============");
        courseManager.removeStudentById("X002");
        courseManager.showAllStudents();
        System.out.println("==================Get Student By Id============");
        courseManager.findStudentById("X005");


    }
}
