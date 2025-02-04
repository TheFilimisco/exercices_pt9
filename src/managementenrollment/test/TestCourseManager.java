package managementenrollment.test;

import managementenrollment.models.CourseManager;
import managementenrollment.models.Student;

public class TestCourseManager {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        System.out.println("=================Enrollment Student==============");
        courseManager.enrollmentStudent(new Student("Steven",35));
        courseManager.enrollmentStudent(new Student("Steven",55));
        courseManager.enrollmentStudent(new Student("Steven",12));
        courseManager.enrollmentStudent(new Student("Steven",24));
        courseManager.enrollmentStudent(new Student("Steven",25));
        System.out.println("=================Show All Students==============");
        courseManager.showAllStudents();
        System.out.println("==================Remove Student by Id============");
        courseManager.removeStudentById("Steven35");
        courseManager.showAllStudents();
        System.out.println("==================Get Student By Id============");
        courseManager.findStudentById("Steven55");
    }
}
