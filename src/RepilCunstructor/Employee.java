package RepilCunstructor;

class Employee {


    String name;

    String lastName;

    int employeeId;

    String startDate;

    int salary;

    Employee() {
        name = name;
        lastName = lastName;
        employeeId = employeeId;
        startDate = startDate;
        salary = salary;

    }
        Employee(String name, String lastName, int employeeId, String startDate,int salary){
            this.name = name;
            this.lastName = lastName;
            this.employeeId = employeeId;
            this.startDate = startDate;
            this.salary = salary;
        }

            void info () {
                System.out.println(name + " " + lastName + " " + employeeId + " " + startDate + " " + salary);
            }
        }
    class Main {
        public static void main(String[]args){
            Employee em= new Employee();
            em.info();
            Employee em1= new Employee("Joe","Smith", 12345,"01/01/1970",35000 );
            //Joe","Smith","01/01/1970", 35000);
            em1.info();
        }

    }






