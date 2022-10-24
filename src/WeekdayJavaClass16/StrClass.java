package WeekdayJavaClass16;

public class StrClass {
    // Create a method that will take a String as a parameter and returns reversed String. Method should be available to all classes
    //  within your project and accessible by class name.

    public static String strmeth(String a) {
        String st = "";
        for (int i = a.length()-1; i>=0; i--) {
            char ch = a.charAt(i);
            st = st += ch+" ";
        }
        return st;
    }
        public static void main(String[]args){

                  System.out.println(StrClass.strmeth("Hello World"));





        }
}
