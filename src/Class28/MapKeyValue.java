package Class28;

import java.util.HashMap;

public class MapKeyValue {
    public static void main(String[] args) {


        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone", 1000.0);
        items.put("Eggs", 4.0);
        items.put("Apples", 2.0);
        items.put("Keybord", 100.0);
        items.put("flowers", 1000.0);
        items.put("Iphone14", 1500.0);
//Set<Map.Entry<String, Double>>entrySet= items.entrySet();
var entry=items.entrySet();
for(var item:entry){
    System.out.println(item.getKey()+" "+item.getValue());

}

    }

    }
