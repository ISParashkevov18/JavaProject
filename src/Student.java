import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public String name;
    public String ucn;
    public int[] grades;
    public int course;

    public Student(String name, String ucn, int[] grades, int course) {
        this.name = name;
        this.ucn = ucn;
        this.grades = grades;
        this.course = course;
    }

    public void printStudents(Student student) {

        ArrayList<Student> students = new ArrayList<>();

        if(student.course > 2) {
            students.add(student);
        }

        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ucn='" + ucn + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", course=" + course +
                '}';
    }
}
