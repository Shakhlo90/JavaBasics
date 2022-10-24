package WeekendClass13;

public class HW5 {
    public static void main(String[] args) {

        String str = "abac";
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

            if (str.equals(rev)) {
                ans = true;
                System.out.println(rev + "=" + ans);

            } else {
                System.out.println(str + "=" + ans);
            }
        }
    }
}
