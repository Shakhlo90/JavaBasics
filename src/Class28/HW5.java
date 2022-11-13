package Class28;

import java.util.Collections;
import java.util.HashMap;

public class HW5 {
    public static void main(String[] args) {
        HashMap<String, Double> employeers = new HashMap<>();
        employeers.put("Robert", 120000.0);
        employeers.put("Jey", 130000.0);
        employeers.put("Ray", 150000.0);
        employeers.put("Smith", 140000.0);
        employeers.put("Johnson", 200000.0);
        employeers.put("George", 300000.0);
        var highSalary = employeers.entrySet();
        Double max = (Collections.max(employeers.values()));
        for (var salary : highSalary) {
            if (salary.getValue() == max) {
                System.out.println(salary.getKey() + "=" + "$" + salary.getValue());
            }
        }

    }
}
