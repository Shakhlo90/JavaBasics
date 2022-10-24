package Class17;

public class Main {
   

   public   String alphabetical(String str){
    String result="";
    for(int i=0; i<str.length();i++) {
        if ('a' < str.charAt(i) && str.charAt(i)<'z') {
            result += str.charAt(i);
        }
    }
        return result.toLowerCase();
    }
    public static void main(String[]args){
        Main m= new Main();
        System.out.println(m.alphabetical("Software"));
    }
}





