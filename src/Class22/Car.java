package Class22;

public class Car {
    void start() {
        System.out.println("Use the key to start me");
    }

    void stop() {
        System.out.println("Use brakes to stop me");
    }

    void park() {
        System.out.println("Parking manually it ");
    }
}
        class BMW extends Car{

     void start(){
         super.start();
         System.out.println("Use push start to start me");
     }
void stop(){
         super.stop();
    System.out.println(" I can use auto - breaking to stop me");
}
    }
   class Toyota extends Car{
void start(){
    super.stop();
    }

 class Mercy extends Toyota{}


}


