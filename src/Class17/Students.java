package Class17;

public class Students {
    String name;
   protected int sub1;
    int sub2;
    int sub3;

  public   Students(String sname, int math, int reading, int writing) {
        name = sname;
        sub1 = math;
        sub2 = reading;
        sub3 = writing;

    }

    void calculateAverageGrade() {
        int av = (sub1 + sub2 + sub3) / 3;
        if (av >= 90) {
            System.out.println(name + ",Your grade is A");
        } else if (av >= 80) {
            System.out.println(name + ",Your grade is B");
        } else if (av >= 70) {
            System.out.println(name + ",Your grade is C");
        } else {
            System.out.println(name + ",Your grade is D");
        }

    }


}
