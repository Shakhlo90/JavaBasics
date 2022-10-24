package Class17;

public class Students1 {/*Write a java class that will have a constructor: one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and create 4 objects of this class:
 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.

Write program that have static constructor and observe result.*/


    String name;
    int stnum;
    int grade;

    String dob;
    String birthplace;
    String ssn;
    String homeadd;


    Students1(){}
    Students1( String sname, int snum, int sgrade, String sdob, String sbirthplace, String sssn){

        name=sname;
        stnum=snum;
        grade=sgrade;
        dob=sdob;
        birthplace=sbirthplace;
        ssn=sssn;


    }
    public void enrolled(){
        System.out.println("Congratulation," +name+"You are successfully enrolled");
    }
    public  void start(){
        System.out.println("Start day is from October");
    }









}
