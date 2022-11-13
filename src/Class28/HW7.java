package Class28;

import java.util.Collection;
import java.util.LinkedList;

public class HW7 {
    public static void main(String[] args) {
        Collection<Integer>integers=new LinkedList<>();
        integers.add(7);
        integers.add(7);
        integers.add(84);
        integers.add(99);
        integers.add(88);
        integers.add(88);
        int sum=0;
        for (int result:integers){
            sum+=result;
        }
        System.out.println("sum of all integers is "+sum);
    }
}
