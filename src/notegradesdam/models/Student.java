package notegradesdam.models;

public class Student {
    private int idStudent;
    private double note_grade;
    static private int counter = 0;

    public Student(double note_grade) {
        this.idStudent = counter++;
        this.note_grade = note_grade;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public double getNote_grade() {
        return note_grade;
    }

    public void setNote_grade(double note_grade) {
        this.note_grade = note_grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", note_grade=" + note_grade +
                '}';
    }
}
