package Class24;

import java.util.ArrayList;
import java.util.Arrays;

public class FrameWork {
    public static void main(String[] args) {
        String[] breeds= new String[10];
        breeds[0]="Buuldogs";
        System.out.println(Arrays.toString(breeds));

        ArrayList<String> colors= new ArrayList<>();
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);
    }
}
