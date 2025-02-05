package scrumhashmap.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Scrum {
    private HashMap<String, ArrayList<Student>> listsScrumHashMap;


    public Scrum(HashMap<String, ArrayList<Student>> listsScrumHashMap) {
        this.listsScrumHashMap = listsScrumHashMap;
    }

    public Scrum() {
        listsScrumHashMap = new HashMap<>();
    }

    public HashMap<String, ArrayList<Student>> getListsScrumHashMap() {
        return listsScrumHashMap;
    }

    public void setListsScrumHashMap(HashMap<String, ArrayList<Student>> listsScrumHashMap) {
        this.listsScrumHashMap = listsScrumHashMap;
    }

    public boolean addProject(String projectName){
        listsScrumHashMap.put(projectName, new ArrayList<>());
        return false;
    }

    public boolean addStudent(String projectName, Student student){
        return false;
    }

    public boolean removeProject(String projectName, Student student){
        return false;
    }

    public void showProjects(){

    }

    public boolean removeStudent(String projectName,String studentId){
        return false;
    }




}
