package managementenrollment.models;

public class Student {
    private String nameStudent;
    private int AgeStudent;

    public Student(String nameStudent, int ageStudent) {
        this.nameStudent = nameStudent;
        AgeStudent = ageStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return AgeStudent;
    }

    public void setAgeStudent(int ageStudent) {
        AgeStudent = ageStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", AgeStudent=" + AgeStudent +
                '}';
    }
}
