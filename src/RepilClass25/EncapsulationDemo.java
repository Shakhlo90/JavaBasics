package RepilClass25;

public class EncapsulationDemo {

   private String empName;
   private int empAge;
   EncapsulationDemo(String empName, int empAge){
       setEmpName(empName)
       ;
       setEmpAge(empAge);
   }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public static void main (String[]args){
            EncapsulationDemo capsula = new EncapsulationDemo("John", 30);
            System.out.println("Employee Name: "+capsula.getEmpName());
            System.out.println("Employee Age:"+capsula.getEmpAge());

        }
    }


