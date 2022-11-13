package Class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Lamdapractice {
    public static void main(String[] args) {
        HashMap<String, Double> item = new HashMap<>();
        item.put("Iphone", 1000.0);
        item.put("Eggs", 4.0);
        item.put("Apples", 2.0);
        item.put("Keybord", 100.0);
        item.put("flowers", 1000.0);
        item.put("Iphone14", 1500.0);
item.keySet().removeIf(name->name.contains("e"));
        System.out.println(item);
        Set<String> allkeys=item.keySet();
for(String keys:allkeys){
    System.out.println(keys);
}

Collection<Double> values=item.values();
for(Double value:values){
    System.out.println(value);
}




    }
}