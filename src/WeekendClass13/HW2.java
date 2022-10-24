package WeekendClass13;

public class HW2 {
    public static void main(String[] args) {
        String sen = "Is it saturday? Is it raining? Do we have a Java Class today?";
        int count = 0;
        String[] c = sen.split("[?]");
        for (int i = 0; i < c.length; i++) {
            count++;
            System.out.println(c[i]);
            System.out.println(count);
        }


    }
}
