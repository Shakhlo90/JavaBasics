package Class28;

import java.util.HashMap;

public class Values {
    public static void main(String[] args) {


        HashMap<String, Double> item = new HashMap<>();
        item.put("Iphone", 1000.0);
        item.put("Eggs", 4.0);
        item.put("Apples", 2.0);
        item.put("Keybord", 100.0);
        item.put("flowers", 1000.0);
        item.put("Iphone14", 1500.0);


 for (Double value:item.values()){
     System.out.println(value);

 }



    }
}