package WeekendClass13;

public class HW3 {
    public static void main(String[] args) {

        String a="Good";
        String b="Well";

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a + b);}
}
