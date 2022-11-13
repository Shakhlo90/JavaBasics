package Class28;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {


        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone", 1000.0);
        items.put("Eggs", 4.0);
        items.put("Apples", 2.0);
        items.put("Keybord", 100.0);
        items.put("Flowers", 1000.0);
        items.put("Iphone14", 1500.0);

        var both=items.entrySet().iterator();
        while (both.hasNext()){
            var item=both.next();
            var key=item.getKey();
            var value=item.getValue();
            if(key.contains("e")&& value>10){
                both.remove();
            }
        }
        System.out.println(items);
        items.entrySet().removeIf(M->M.getKey().contains("e")&&M.getValue()>100);
        System.out.println(items);

    }
}