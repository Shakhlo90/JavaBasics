package SaturdayClass14;

public class PalindromHW5 {
    public static void main(String[] args) {
        String str="bob";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if (sb.toString().equals(str)){
            System.out.println("The string is Palindrom");
        } else {
            System.out.println("The string is not Palindrom");
        }
    }
}
