package Class28;

import java.util.HashMap;
import java.util.Iterator;

public class Mapclass {
    public static void main(String[] args) {
        HashMap<String, Double>item=new HashMap<>();
        item.put("Iphone",1000.0);
        item.put("Eggs",4.0);
        item.put("Apples",2.0);
        item.put("Keybord",100.0);
        item.put("flowers",1000.0);
        item.put("Iphone14",1500.0);




// remove based on value
        // first we get a collection of values then iterator;
        item.values().removeIf(price -> price > 10);
        System.out.println(item);
        Iterator<Double>iterator=item.values().iterator();
        while (iterator.hasNext()){
            Double p=iterator.next();
            if(p>20){
                System.out.println(item);
            }
        }

    }
}
