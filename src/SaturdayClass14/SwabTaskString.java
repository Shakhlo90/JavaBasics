package SaturdayClass14;

public class SwabTaskString {
    public static void main(String[] args) {
        String str1="Good";
        String str2="Well";

        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1
        );
        System.out.println(str2);
    }
}
