package Class20;

public class HWClass20 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    void calculate(double len, double wid)
    {
        System.out.println(len*wid);

    }
   void  calculate(double len){
        System.out.println("The area of the rectangle: "+len*len);
    }

    void calculateVolume(double len, double height, double width)
    {
        System.out.println("The area of circle: "+ len*height*width);

    }

}
class TesterHWClass20{
    public static void main(String[] args) {
        HWClass20 hw=new HWClass20();
        hw.calculate(3,5);
        hw.calculate(5)
        ;
        hw.calculateVolume(4,6,8);

    }
}