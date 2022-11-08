package Class26;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetHW4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("France");
        treeSet.add("Japan");
        treeSet.add("Tashkent");
        treeSet.add("Afganistan");
        treeSet.add("Beijin");
        System.out.println(treeSet);
        var itter=treeSet.iterator()
;

    while (itter.hasNext()){
        System.out.println(itter.next());;

    }
        ArrayList<String>con=new ArrayList<>(treeSet);
        System.out.println(con);
    }
}
