import java.util.ArrayList;

public class Person {

    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
