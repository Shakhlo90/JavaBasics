public class Car {
    String make;

    String model;

    int numberOfDoors;

    int topSpeed;

    double price;

    Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }




    Car(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;


    }




    Car( int numberOfDoors, int topSpeed, double price) {
         make = "unknown";
         model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }




        Car(String make, String model, int numberOfDoors){
            this.make = make;
            this.model = model;
            this.numberOfDoors = numberOfDoors;
            topSpeed = 90;
            this. price = (int) 0;
        }
        void info() {
            System.out.println(make+" " + model+" " + numberOfDoors+" " + topSpeed+ " " + price);


        }

    public static void main(String[] args) {
        Car a=new Car("Tayota",  "Prius",4,120, 3000.0);
        a.info();
        Car b=new Car("Tayota",  "Prius", 120, 3000.0);
        b.info();
        Car c=new Car(4,120, 3000.0);
        c.info();
        Car d=new Car("Toyota", "Prius", 4);
        d.info();



    }


    }