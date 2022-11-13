package Review11;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
   private String firtname;

    public Student(String firtname, String lastname, String id) {
        this.firtname = firtname;
        this.lastname = lastname;
        this.id = id;
    }

    private String lastname;
   private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firtname, student.firtname) && Objects.equals(lastname, student.lastname) && Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firtname, lastname, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firtname='" + firtname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id='" + id + '\'' +


                '}';


}}
class Test {
    public void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Josh", "Plantin", "234rewwsdd"));
        students.add(new Student("Josh", "Plantin", "234rewwsdd"));
        students.add(new Student("Josh", "Plantin", "234rewwsdd"));
        students.add(new Student("Josh", "Plantin", "234rewwsdd"));
        students.add(new Student("Josh", "Plantin", "234rewwsdd"));
        students.add(new Student("Josh", "Plantin", "234rewwsdd"));
        System.out.println(students);

        Student s = new Student("Josh", "Plantin", "234rewwsdd");
        System.out.println(students.contains(s));
        System.out.println(s);
        System.out.println(s);
    }
}