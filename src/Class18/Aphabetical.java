package Class18;

public class Aphabetical {
    public static String alphabetical(String str) {
        String nString = "";
        int value;
        for (int i = 0; i < str.length() - 1; i++) {
            value = Math.max((int) str.charAt(i), (int) str.charAt(i + 1));
            nString += (char) value;
            if (i < str.length() - 3)
                i++;
        }
        return nString;
    }


    public static void main(String[]args){
        Aphabetical m= new  Aphabetical();
        System.out.println(m.alphabetical("hello"));
    }
}

