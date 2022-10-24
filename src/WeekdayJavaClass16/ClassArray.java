package WeekdayJavaClass16;

 class ClassArray {
     //Create a method that will accept an array as parameters and will return a sum of all elements
    // from that array. Method should be visibly only within same package and accessible by the creating an instance of the class.


  double  arraymeth(int[] a){
        int sum=0;
        for(int i=0; i<a.length;i++){
            sum=sum+=a[i];
        }
        return sum;

}
public static void main(String[]args){
ClassArray clarr=new ClassArray();
    int []a={4,6,8,9,45,78};
    System.out.println((int)clarr.arraymeth(a));


   }
}