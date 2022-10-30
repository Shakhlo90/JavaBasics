package Class24;

import java.util.ArrayList;

public class HWArrayList
{
    public static void main(String[] args) {

        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Sugar");
        arrayList.add("butter");
        arrayList.add("cinnamon");
        arrayList.add("milk");
        arrayList.add("water");
        if(arrayList.isEmpty()){
            System.out.println(arrayList+"is empty");
        }else {
        System.out.println("The given ArrayList is empty = "+arrayList.isEmpty());}

        System.out.println("the specific name is present in an ArrayList  = "+arrayList.contains("butter"));
        System.out.println("the size of the  arrayList is "+arrayList.size());
        System.out.println(arrayList);

    }
}
