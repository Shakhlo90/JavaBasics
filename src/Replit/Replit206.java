package Replit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Replit206 {
    public static void main(String[] args) {
        HashMap<String, String> map=new HashMap<>();
        map.put("ONE","AAA");

        map.put("TWO","BBB");

        map.put("THREE","CCC");

        map.put("FOUR","DDD");

        map.put("FIVE","EEE");
        Set<HashMap.Entry<String,String>>set=map.entrySet();
        System.out.println(map.get(set.remove("ONE")));
        var values=map.values();
        System.out.println(values);
        Collection<String>allkeys=map.keySet();
        System.out.println(allkeys);

        for(HashMap.Entry<String, String>entry1:map.entrySet()){
            System.out.println(entry1.getKey()+" "+entry1.getValue());
        }
        map.remove("ONE","AAA");
        map.remove("FOUR","DDD");
        System.out.println("-----------------------------");
        for(HashMap.Entry<String, String>entry2:map.entrySet()){
            System.out.println(entry2.getKey()+" "+entry2.getValue());
        }


            }

        }


