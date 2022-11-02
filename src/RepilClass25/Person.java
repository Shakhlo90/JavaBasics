package RepilClass25;

public class Person {
    String   firstname;
    String lastname;
    int birthmonth;
    int birthday;
    int birthyear;
    String ssn;

    public  Person(String firstname, String lastname,int birthmonth,int birthday, int birthyear,String ssn){
        this.firstname=firstname;
        this. lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this. birthyear= birthyear;
        this. ssn= ssn;
    }


    String  getFirstname(){
        return firstname;
    }
    String getLastname(){
        return lastname;
    }

    int getBirthmonth(){
        return birthmonth;
    }
    int getBirthday(){
        return birthday;
    }
    int getBirthyear(){
        return birthyear;
    }
    String getSsn(){
        return ssn;
    }
    public String  formatBirthday(){
        return  birthmonth+"/"+birthday+"/"+birthyear;
    }

}

class PersonTester
{
    public static void main(String[]args){
        Person person= new Person("John", "Doe",10,25,1900,"123-45-6789");
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.formatBirthday());
        System.out.println(person.getSsn());





    }
}