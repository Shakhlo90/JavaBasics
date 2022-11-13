package Class28;

import java.util.HashMap;

public class HW3 {
    public static void main(String[] args) {
        HashMap<Long, String> BestBuyStore = new HashMap<>();
        BestBuyStore.put(234566777L, "Headphones");
        BestBuyStore.put(786543298L, "Laptops");
        BestBuyStore.put(765784367L, "Cell Phones");
        BestBuyStore.put(7668885433L, "PC Gaming");
        BestBuyStore.put(8765433226L, "Cameras");
        BestBuyStore.put(6789765099L, "Tablets");
        var entries = BestBuyStore.entrySet();
        System.out.println(entries);
    }
}
