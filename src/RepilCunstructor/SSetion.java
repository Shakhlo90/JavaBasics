import Class22.WebDriver;From rimma ryspek to Everyone 07:00 PM
class Main {
    static final String m1(){
        String str="hello";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        return str1;
    }
    public static void main (String[] args){

        System.out.println(m1());
    }
}
168
        From rimma ryspek to Everyone 07:12 PM
class Main {
    static final double avgElements(int [] arr){
        double sum=0.0;
        int len=arr.length;;
        for(int i=0; i<len; i++){
            sum+=arr[i];
        }
        return sum/len;
    }
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}
169
class Main {
    static final void m1(boolean x){
        System.out.println("Final method with boolean parameter");
    }
    static final void m1(String x){
        System.out.println("Final method with String parameter");
    }
    public static void main ( String [] args){
        Main m = new Main();
        m.m1(true);
        m.m1("rr");
    }
}
170
        From rimma ryspek to Everyone 07:25 PM
abstract class Parent{
    abstract void m1();
    abstract void m1(int j);
}

class Main extends Parent {
    void m1 (){
        System.out.println("m1 without parameters");
    }
    void m1 (int j){
        System.out.println("m1 method with parameter");
    }

    public static void main ( String [] args){
        Main m = new Main();
        m.m1();
        m.m1(34);
    }

}
171
abstract class Parent{
    abstract void m1();
    void m2(){
        System.out.println("Parent class providing implementation");
    }
}
class Main extends Parent{
    void m1(){
        System.out.println("Child class providing implementation");

    }
    public static void main(String[] args){
        Main m = new Main();
        m.m1();
        m.m2();
    }

}
172
        From rimma ryspek to Everyone 07:36 PM
abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}
class LemonTea extends Tea{
    LemonTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{
    ChaiTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }
}
class Main {
    public static void main(String [] args){
        Tea[]arr = {new LemonTea("Lemon Tea"),new ChaiTea("Chai Tea")};
        for(Tea chai:arr){
            chai.addSugar();
        }
    }
}
173
class Main implements MyInterface{
    public void method1(){
        System.out.println("implementation of method1");
    }
    public void method2(){
        System.out.println("implementation of method2");
    }
    public static void main ( String [] args){
        Main m = new Main();
        m.method1();
        m.method2();
    }

}

class Main implements MyInterface{
    public void method1(){
        System.out.println("implementation of method1");
    }
    public void method2(){
        System.out.println("implementation of method2");
    }
    public static void main ( String [] args){
        Main m = new Main();
        m.method1();
        m.method2();
    }

}

class Main implements MyInterface{
    public void method1(){
        System.out.println("implementation of method1");
    }
    public void method2(){
        System.out.println("implementation of method2");
    }
    public static void main ( String [] args){
        Main m = new Main();
        m.method1();
        m.method2();
    }

}
interface ParentInterface {
    void parentMethod();
}
interface ChildInterface extends ParentInterface {
    void childMethod();
}
class Main implements ChildInterface  {
    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    }

    public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    }
    public static void main(String [] args){
        Main m =new Main();
        m.parentMethod();
        m.childMethod();
    }

}
176
interface Outputs{
    void display(double result);
}
interface Functions extends Outputs {
    double adding (double a, double b);
    double subtracting (double a, double b);
    double multiply (double a, double b);
    double dividing (double a, double b);
}

class Main implements Functions {
    public void display(double result){
        System.out.println("Result is ::: "+ result);
    }
    public double adding (double a, double b){
        return a+b;
    }
    public double subtracting (double a, double b){
        return a-b;
    }
    public double multiply (double a, double b){
        return a*b;
    }
    public double dividing (double a, double b){
        return a/b;
    }
    public static void main(String [] args){
        Main m= new Main();
        m.display(m.adding(60, 60));
        m.display(m.subtracting(180,100));
        m.display(m.multiply(200,10));
        m.display(m.dividing(25,5));
    }
}


ublic class Test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //chromedriver.exe for Windows users

        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("https://www.syntaxtechs.com/"); // navigate to url
        String url = driver.getCurrentUrl(); // getting current url
        System.out.println(url);
        String title= driver.getTitle(); // getting title of the page
        System.out.println(title);


    }

}
