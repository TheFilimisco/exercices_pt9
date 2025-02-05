package scrumhashmap.test;

import scrumhashmap.models.Scrum;
import scrumhashmap.models.Student;

public class TestScrum {
    public static void main(String[] args) {
        Scrum scrum = new Scrum();
        System.out.println("=================Add Project====================");
        System.out.println(scrum.addProject("X001"));
        System.out.println(scrum.addProject("X001"));


        System.out.println("=======================Show Projects=================");
        scrum.showProjects();
        System.out.println("========================Add Student==================");
        System.out.println(scrum.addStudent("X001",new Student("S002","Steven1")));

        System.out.println(scrum.addStudent("X002",new Student("S003","Steven2")));

        System.out.println(scrum.addStudent("X003",new Student("S001","Steven4")));
        System.out.println(scrum.addStudent("X003",new Student("S001","Steven4")));
        //It would be false
        System.out.println(scrum.addStudent("X004",new Student("S001","Steven4")));
        System.out.println("=======================Show Projects=================");
        scrum.showProjects();


        System.out.println("=====================Remove projects==================");
        System.out.println(scrum.removeProject("X003"));
        System.out.println(scrum.removeProject("X006"));
        System.out.println("=======================Show Projects=================");
        scrum.showProjects();
        System.out.println("=====================Remove Student==================");
        System.out.println(scrum.removeStudent("X001", "S002"));
        System.out.println(scrum.removeStudent("X001", "S006"));
        scrum.showProjects();



    }
}
