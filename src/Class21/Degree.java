package Class21;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
  @Override

        void getPrerequisite(){
            System.out.println("To get a Master's degree you need a Bachelor's diploma");
        }
    }
class TestDegree{
    public static void main(String[] args) {
        Degree d = new Degree();
        d.getPrerequisite();
        Bachelors b= new Bachelors();
        b.getPrerequisite();
        Masters m= new Masters();
        m.getPrerequisite();

    }
}