package Class26;

import java.util.HashSet;

public class HW6 {
    public static void main(String[] args) {
        HashSet<String>student= new HashSet<>();
    }
}
class student{
    String name;
    String id;
    student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println(name);
    }
    }
class A{
    public static void main(String[] args) {
        HashSet<student>test=new HashSet<>();
        test.add(new student("John", "WQ5678899"));
        test.add(new student("Jerry", "WQ5678899"));
        test.add(new student("Johnson", "WQ5678899"));
        test.add(new student("Muhammad", "WQ5678899"));

        for (student str:test) {
        str.display();
        }
        }
}