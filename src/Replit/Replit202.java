package Replit;

import java.util.Map;
import java.util.TreeMap;

public class Replit202 {
    public static void main(String[] args) {
        TreeMap<String, String> items=new TreeMap<>();
        items.put("1 item "," apple");
        items.put("2 item "," banana");
        items.put("3 item "," pear");
        items.put("4 item "," tomato");
        items.put("5 item "," mango");
        items.put("6 item "," kiwi");
        items.put("1 item "," apple");
        for(Map.Entry<String, String>entry:items.entrySet()){
            System.out.println("Key is "+entry.getKey()+" and  values is "+entry.getValue());
        }

       /* Set<Entry<String, String >>list =items.entrySet();
        Iterator<Entry<String, String>>iterator=list.iterator();
        Iterator<Entry<String, String>> iterator = list.iterator();
        while(iterator.hasNext()) {
            Entry<String, String> mentry = iterator.next();

        }

*/
    }
}
