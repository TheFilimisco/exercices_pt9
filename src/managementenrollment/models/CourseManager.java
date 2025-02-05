package managementenrollment.models;

import footballteam.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseManager {
    private HashMap<String,Student> studentsHashMap;

    public CourseManager(HashMap<String, Student> studentsHashMap) {
        this.studentsHashMap = studentsHashMap;
    }

    public CourseManager() {
        studentsHashMap = new HashMap<>();
    }

    public HashMap<String, Student> getStudentsHashMap() {
        return studentsHashMap;
    }

    public void setStudentsHashMap(HashMap<String, Student> studentsHashMap) {
        this.studentsHashMap = studentsHashMap;
    }

    public void enrollmentStudent(Student student){
        studentsHashMap.put(student.getIdStudent(),student);
        System.out.println("Successfully");
    }

    public void removeStudentById(String id){
        if (!studentsHashMap.containsKey(id)){
            System.out.println("Don't exist that id!");
        } else System.out.println(studentsHashMap.remove(id));

    }

    public void findStudentById(String id){
        if (!studentsHashMap.containsKey(id)){
            System.out.println("Don't exist that id!");
        } else System.out.println(studentsHashMap.get(id));
    }

    public void showAllStudents(){
        List<Map.Entry<String, Student>> newListStudents = new ArrayList<>(studentsHashMap.entrySet());
        newListStudents.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, Student> entry : newListStudents) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }


}
