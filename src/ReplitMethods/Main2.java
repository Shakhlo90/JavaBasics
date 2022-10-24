package ReplitMethods;

public class Main2 {
  static   String mixString(String s1, String s2){
        String newstr="";
        for(int i=0; i<s1.length();i++) {
            newstr = newstr + s1.charAt(i);
            if (i < s2.charAt(i)) {
                newstr += s2.charAt(i);}
            }
            return newstr;
        }
            public static void main(String[] args){
            String firstValue = mixString("12345","abcde");
            System.out.println(firstValue);
            String secondValue = mixString("howdy","hello");
            System.out.println(secondValue);



        }



}
