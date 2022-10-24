package SaturdayClass14;

public class Task2 {
    public static void main(String[] args) {
        String str="ADF567@#$9008";
str=str.replace("[^A-Za-z0-9]", "");
        System.out.println(str);
        System.out.println(str.length());
    }

}
