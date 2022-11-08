package Replit;

import org.apache.commons.collections4.map.LinkedMap;

import java.util.*;

public class Replit200 {
    public static void main(String[] args) {
        LinkedMap<String,String> data=new LinkedMap<>();
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
      HashMap<String,String> map=new HashMap<>();
    }
}
