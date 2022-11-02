package Class25;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




public class Primitive {
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        List<String> countries2 = new LinkedList<>();
        Iterator<String>con=countries.iterator() ;
        while (con.hasNext()){
            String iter=con.next();
            if (iter.startsWith("A")){
              con.remove();
            }
        }
        System.out.println(countries);


        List<Integer> num = new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);


        int total=0;
       for (int i=0; i<num.size();i++){
           total+=num.get(i);

       }
        System.out.println(total);


            }
        }


