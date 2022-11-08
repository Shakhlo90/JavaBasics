package RepilClass25;

import java.util.ArrayList;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer>even=new ArrayList<>();
       /* for (int i=1; i<=500; i++){
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
        System.out.print(even);*/

        for(int i=2; i<=500; i=i+2){
            even.add(i);
        }
        System.out.println(even);
        var it=even.iterator();
        while(it.hasNext()){
            Integer num=it.next();
            if(num%5==0){
                it.remove();
            }
        }

        System.out.println(even);

    }
}
