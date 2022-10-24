package Class18;

public class Alpa {


   private String apl(String str){
    String s = "";
    for (int i = 0; i < str.length(); i += 2) {

        s=s+=str.charAt(i);

    }
    return s.toLowerCase();
}




        public static void main(String[]args){
          Alpa a=new Alpa();
            System.out.println(a.apl("Hello"));

        }
    }