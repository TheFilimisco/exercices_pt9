package managementenrollment.models;

public class Student {
    private String idStudent;
    private String nameStudent;
    private int AgeStudent;

    public Student(String idStudent, String nameStudent, int ageStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        AgeStudent = ageStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
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
                "idStudent='" + idStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", AgeStudent=" + AgeStudent +
                '}';
    }
}
