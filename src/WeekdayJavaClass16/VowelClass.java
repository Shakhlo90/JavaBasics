package WeekdayJavaClass16;

public class VowelClass {
    //   // Create a method that will accept a String as a parameter and return a new String that consist only of vowels. Method should be
    //    // available inside the class only where it was declared and executed by calling it is name.


    private void strmeth(String a ){
        String str="";

        for(int i=0; i<a.length()-1;i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
              str=str+=a.charAt(i)+" ";}
            }
            System.out.println(str);



    }
    public static void main(String[]args){
        VowelClass vowel=new VowelClass();
        vowel.strmeth("Hello World");

        ClassArray carr=new ClassArray();
        int []a={5,7,8,9};
        System.out.println(carr.arraymeth(a));
    }
}
