package RepilClass25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer>even=new ArrayList<>();
        for (int i=1; i<=500; i++){
            if(i%2==0)
            even.add(i);
        }

        Iterator<Integer>num=even.iterator();
        while (num.hasNext()){
            int result=num.next();
            if(result%5==0){
                num.remove();
            }

        }
        System.out.print(even);
    }
}
