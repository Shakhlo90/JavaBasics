package Class20;

public class Programming {
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String name){
        System.out.println("I love "+ name);
    }
}
class TestProgrammingTask{
    public static void main(String[] args) {
        Programming p1= new Programming();
        Programming p2= new Programming("Java");
    }
}