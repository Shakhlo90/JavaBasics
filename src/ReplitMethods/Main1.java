package ReplitMethods;

public class Main1 {//Replace
  static   String surround(String s, String search){
        String newstr="";
        newstr=s.replaceAll(search,"("+search+")");


    return newstr;
}
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
  //static String surround(String s, String search_term)
        //	{String newstr="";
        //   newstr=s.replaceAll(search_term,"("+search_term+")");
        //
        //      return newstr;
        //	}
        //


  }

}