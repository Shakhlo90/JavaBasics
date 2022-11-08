package Class26;

import java.util.ArrayList;
import java.util.Iterator;

abstract public class Insurance {
   public  String  insuranceName;
  Insurance(String insuranceName){
      this.insuranceName=insuranceName;
  }


  abstract   void getQuote ();
  abstract   void cancelInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
 class Car extends Insurance{
    String carModel;
Car(String  insuranceName, String carModel){
    super(insuranceName);
    this.carModel=carModel;
}



    @Override
    void getQuote() {
        System.out.println("charges 3% of car value");
    }

    @Override
    void cancelInsurance() {
        System.out.println("in two years");
    }

     @Override
     public String toString() {
         return "Car{" +
                 "carModel='" + carModel + '\'' +
                 ", insuranceName='" + insuranceName + '\'' +
                 '}';
     }
 }
class Pet extends Insurance{
String  petType;
    Pet(String  insuranceName,  String petType) {
        super(insuranceName
        );
        this.petType = petType;
    }



    @Override
    void getQuote() {
        System.out.println("whole coverage");
    }

    @Override
    void cancelInsurance() {
        System.out.println(" one year");
    }



    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Health extends Insurance {
    Health(String  insuranceName) {
        super(insuranceName);
    }
    @Override
    void getQuote() {
        System.out.println("Primary Physician");
    }

    @Override
    void cancelInsurance() {
        System.out.println("in 3 years");
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
class Test{
    public static void main(String[] args) {



        ArrayList<Insurance> clasess= new ArrayList<>();
        clasess.add(new Car("Geco", "Honda"));
        clasess.add(new Pet("Petisurance", "Cat"));
        clasess.add(new Health("Heath parners"));
        for (Insurance arr:clasess){

          arr.getQuote();
          arr.cancelInsurance();

        }
        System.out.println("-----------------------------------------------------------------------");

        Iterator<Insurance> itter =clasess.iterator();
        while (itter.hasNext()) {
            Insurance item=itter.next();

            item.getQuote();
            item.cancelInsurance();


        }

    }
}