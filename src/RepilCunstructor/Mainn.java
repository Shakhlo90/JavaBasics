package RepilCunstructor;

class Person{
    String name;

    String lastName;

    int age;
    Person(String name,String lastName,int age){
        this.age=age;
        this.name=name;
        this.lastName=lastName;
    }
    void person(){System.out.println( name+" "+lastName+" "+age);
    }

}
class Employeee extends Person {
    int salary;
    Employeee(String name,String lastName,int age){
        super(name, lastName,age) ;
        salary=35000;
    }
    void emp(){System.out.println( name+" "+lastName+" "+age+" "+salary);
    }
    class Student extends Employeee {
        int grade;
        Student(String name,String lastName,int age){
            super(name,lastName,age) ;
            grade=10;
        }


        void stu(){System.out.println( name+" "+lastName+" "+grade);}

    }
    class Retiree extends Student{
        String  seniorActivity;
        Retiree(String name,String lastName,int age){

            super(name, lastName,age) ;
            seniorActivity="tour";
        }

        void r(){System.out.println( name+" "+lastName+" "+seniorActivity);
        }
    }
    public static void main(String[] args){
        Employeee e=new Employeee("Joe","Smith",35);
        e.emp();





    }

}