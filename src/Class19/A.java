package Class19;

public class A {
    String model;
    String brand;
    double weight;
    String OS;
    double screenSize;
    int cores;
 void F(){
    System.out.println("The model is "+ model+" ; the brand is "+brand+" ; the weight is "+ weight+" ;" +
            " Operation System is "+ OS+" ; the screen size is "+ screenSize+" ; the core is "+ cores);

}
}

class B extends A{
    public static void main(String[] args) {
        B b=new B();
        b.model="Huawei Nexus 6P";
        b.brand="Google";
        b.weight=178;
        b.OS="Android";
        b.screenSize=5.7;
        b.cores=8;
        b.F();
    }

}
class C extends B{
    double memory;
}
