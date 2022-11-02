package RepilClass25;

public class Main {

    public static void main(String[]args){

        EncapsulationDemo1 demo= new EncapsulationDemo1();
        System.out.println("Employee Name: "+ demo.getEmpName());
        System.out.println("Employee Age: "+
                demo.getEmpAge());


    }


}
class EncapsulationDemo1 {
    private String empName="Mario";
    private int empAge=32;

    String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this. empName=empName;


    }
    int getEmpAge(){
        return empAge;
    }

    public  void setEmpAge(int empAge){
        this.empAge=empAge;
    }


}