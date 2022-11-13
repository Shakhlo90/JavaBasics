package Class28;

import java.util.HashMap;
import java.util.LinkedList;

public class HW {
    public static void main(String[] args) {
        HashMap<Integer, String> company = new HashMap<>();
        company.put(1, "Google");
        company.put(2, "Syntax");
        company.put(3, "Apple");
        company.put(4, "Cisco");
        company.put(5, "Salesforce");
        company.put(6, "IBM");
        company.put(7, "Netflix");
        var entries = company.entrySet();
        System.out.println("The total entries is " + entries.size());
        System.out.println(company);
        company.remove(7, "Netflix");
        company.replace(4, "Cisco", "Microsoft");
        var value = company.values();
        System.out.println(company);
        var list = new LinkedList<>(value);
        System.out.println("Updated company on a 4th floor is " + list.get(3));


    }

}


