package scrumhashmap.models;

import java.util.*;

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
        if (listsScrumHashMap.containsKey(projectName)){
            return false;
        }
        listsScrumHashMap.put(projectName, new ArrayList<Student>());
        return true;
    }

    public boolean addStudent(String projectName, Student student){
        for (ArrayList<Student> students: listsScrumHashMap.values()){
            if (students.contains(student)){
                return false;
            }
        }
        if (!listsScrumHashMap.containsKey(projectName)) {
            addProject(projectName);
        }
        return listsScrumHashMap.get(projectName).add(student);
    }

    public boolean removeProject(String projectName){
        if (listsScrumHashMap.containsKey(projectName)){
            listsScrumHashMap.remove(projectName);
            return true;
        }
        return false;
    }

    public boolean removeStudent(String projectName,String studentId){
        if (listsScrumHashMap.containsKey(projectName)){
            for (ArrayList<Student> students: listsScrumHashMap.values()) {
                for (Student student: students){
                    if (student.getId().equals(studentId)){
                        students.remove(student);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void showProjects(){
        ArrayList<Map.Entry<String, ArrayList<Student>>> listScrum = new ArrayList<>(listsScrumHashMap.entrySet());
        listScrum.sort(Map.Entry.comparingByKey());
        listScrum.forEach(System.out::println);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scrum scrum = (Scrum) o;
        return Objects.equals(listsScrumHashMap, scrum.listsScrumHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listsScrumHashMap);
    }
}
