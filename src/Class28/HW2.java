package Class28;

import java.util.TreeMap;

public class HW2 {
    public static void main(String[] args) {
        TreeMap<String, String>countries=new TreeMap<>();
      countries.put(  "United States","Washington,D.C");
      countries.put(  "Albania","Tirane");
      countries.put(  "Italy","Rome");
      countries.put(  "Germany","Berlin");
      countries.put(  "Japan","Tokyo");
      countries.put(  "France","Paris");
        System.out.println(countries);
        System.out.println("***********************Loop*******************************************");
var loop=countries.entrySet();
for (var advanceloop: loop ){
    System.out.println(advanceloop);
}
        System.out.println("***********************Iterator*****************************************");
var iterator=countries.entrySet().iterator();
while (iterator.hasNext()){
    System.out.println(iterator.next());
}


    }
}
