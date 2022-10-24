package ReplitMethods;

public class Main3 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);

    }
    //create method reduce10 here
    static void reduce10(int a[][]){
        for (int i=0; i<=a.length-1;i++)
        {for (int j=0; j<=a.length;j++){
            System.out.print(a[i][j]-10+" ");
        }
            System.out.println();

        }

    }
}
