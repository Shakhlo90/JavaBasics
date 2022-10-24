package SaturdayClass14;

public class RevercingStrbyword {
    public static void main(String[] args) {
        String str="This is  Java Class";
        String[]arr=str.split(" ");
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<arr.length;i++){
            String word=arr[i];
            StringBuilder sb1=new StringBuilder(word);
            sb1.reverse();
            arr[i]=sb1.toString()
;
        sb.append(arr[i]);sb.append(" ");
            System.out.println(sb);
        }
    }
}
