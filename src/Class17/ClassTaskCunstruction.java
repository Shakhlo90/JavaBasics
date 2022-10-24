package Class17;

public class ClassTaskCunstruction {
    /*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;

     3 - from different class inside different package  and observe result.*/

String name;
String country;
String DOB;
String addrees;

    ClassTaskCunstruction ( String cname, String countryname,String cDOB, String  caddress){
        name=cname;
        country= countryname;
        DOB=cDOB;
        addrees=caddress;



}

    public ClassTaskCunstruction(String name, String country) {
        this.name = name;
        this.country = country;
    }

  private ClassTaskCunstruction(String name, String country, String DOB) {
        this(name, country);

        this.DOB = DOB;
    }

    public ClassTaskCunstruction() {
}

    String str= "Hello";


}

