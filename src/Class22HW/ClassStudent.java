package Class22HW;


class TestStudent{
    public static void main(String[] args) {



        ClassStudent[]students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
    for(ClassStudent student:students){
        student.learn();
        student.teach();
SchoolStudent school= new SchoolStudent();
school.StudentSubject();
CollegeStudent syn = new CollegeStudent();
syn.Student();



        /*SyntaxStudent
        if (students[i] instanceof SyntaxStudent)
            ((SyntaxStudent)students[i]).batch();
        else if (students[i] instanceof CollegeStudent)
            ((CollegeStudent)students[i]).college();
        else
            ((SchoolStudent)students[i]).school();
*/
    }



    }
}





public class ClassStudent {
 void learn(){
     System.out.println("learning basic subjects");
 }
    void teach(){
        System.out.println("being tought basic subjects");
    }
}
class SyntaxStudent extends ClassStudent{
   @Override void learn (){
       System.out.println("learning Java basics");
   }
}
class CollegeStudent extends ClassStudent {
   @Override
   void learn() {
        System.out.println("learning All  classes");}
        void Student(){
            System.out.println("College Student ");

    }
}
class SchoolStudent extends ClassStudent {

    @Override void learn() {
        System.out.println("learning Math basics");}
       void StudentSubject(){
            System.out.println("Algebra");
        }


}