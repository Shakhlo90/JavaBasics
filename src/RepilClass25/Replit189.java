package RepilClass25;

import java.util.ArrayList;
import java.util.Iterator;

public class Replit189 {
    public static void main(String[] args){
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=51; i<=99; i+=3)
        {
            even.add(i);
        }


        Iterator<Integer> num=even.iterator();
        while (num.hasNext()){
            int result=num.next();
            if(result%3!=0){
                num.remove();
            }

        }
        System.out.println(even);
    }
}

