package Class14HWs;

import java.util.Scanner;

public class Grade {
  char grade(int score) {
      char grade;
        if (score > 90){
            grade= 'A';}
       else if (score > 80){
            grade= 'B';}
       else if (score > 70){
            grade= 'C';}
      else  if (score > 50){
           grade ='A';}
        else grade= 'F';
      return grade;
  }

    public static void main(String[] args) {
        Grade gr= new Grade();
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your grade");
        int r=sc.nextInt();
        char x= gr.grade(r);
        System.out.println(x);







    }

}



