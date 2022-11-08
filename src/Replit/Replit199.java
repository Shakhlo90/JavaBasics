package Replit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Replit199 {


            public static void main(String[] args) {
              LinkedHashSet<String> staff=new  LinkedHashSet<>();
                staff.add("null");
                staff.add("Sohil");
                staff.add("Diego");
                staff.add("Alijon");
                staff.add("Asel");
                staff.add("Sumair");
                System.out.println(staff);
                ArrayList<String>names=new ArrayList<>(staff);
                Iterator<String> itter=names.iterator();

                while(itter.hasNext()){
                    String item=itter.next();
                    System.out.println(item);
                }

for (int i=0; i<names.size(); i++){
    System.out.println(names.get(i));
}

            }
        }





