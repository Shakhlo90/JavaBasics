package Replit;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Replit201 {
    public static void main(String[] args) {
            LinkedHashMap<String,String> data=new LinkedHashMap<>();
            data.put("Street", "Patrick ST");
            data.put("Suite", "265");
            data.put("City" ,"Vienna");
            data.put("Zip", "22180");
            data.put("Country", "United State");


            Collection<String> values=data.values();
            Iterator<String>value=values.iterator();
            while (value.hasNext()){
                String item=value.next();

                System.out.println(item);}
        }
    }



