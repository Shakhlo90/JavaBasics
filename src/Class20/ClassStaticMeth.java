package Class20;

public class ClassStaticMeth {
    static void overloaded(int num1, double num2) {
        System.out.println("The first static method for overloaded");
    }

    static void overloaded(String name, String lastname) {
        System.out.println("The second static method for overloaded");
    }

    static void overloaded(char ch, int num) {
        System.out.println("The third static method for overloaded");
    }
}

class ClassPrivate {
    private void overloaded(String name, String id) {
        System.out.println("The first static method for overloaded");
    }

    private void overloaded(int num1, int num2, double num3) {
        System.out.println("The second static method for overloaded");
    }

    private void overloaded(double dnum, char ch, int num) {
        System.out.println("The third static method for overloaded");
    }
    }
