package Class18;

public class Vehicle {
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
void info(){
    System.out.println("The model of the car is "+ model+" made in "+make+" realesed year is "+ "the color: ");
}

}

 class BMW extends Vehicle{
 double engine;
}

class Tayota extends Vehicle{
    double usedmiles;



}
class Tesla{
    String fuil;
}
class CarTester {

    public static void main(String[] args) {
        Tayota tayota= new  Tayota()
;
    tayota.model="Carolla";
    tayota.make="Japan";
    tayota.color="White";

    tayota.info();




    }
}