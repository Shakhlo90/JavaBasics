package Review11;

import java.util.ArrayList;

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
    public String toString() {
        return "Student{" +
                "firtname='" + firtname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        ArrayList<Student> stringArraylist=new ArrayList<>();
        stringArraylist.add(new Student("Josh", "Plantin", "234rewwsdd"));
        System.out.println(stringArraylist);
    }
}