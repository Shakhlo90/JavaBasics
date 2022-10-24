package Class19;

public class Teacher {
    String name;
    String subject;
    String degree;
    int experience;
    String contactNum;
    int age;


    Teacher(String name, String subject, String degree, int experience, String contactNum) {
        this.name = name;
        this.subject = subject;
        this.degree = degree;
        this.experience = experience;
        this.contactNum = contactNum;
    }

    public void info() {
        System.out.println("Teacher : " + name + " " + subject + " " + degree + " " + experience + " " + contactNum);


    }

    void teach() {
        System.out.println(name + "is teaching");
    }
}
    class MathTeacher extends Teacher {
        MathTeacher(String name, String subject, String degree, int experience, String contuctNum) {
            super(name, subject, degree, experience, contuctNum);
        }
    }

    class ChemistryTeacher extends Teacher {
        ChemistryTeacher(String name, String subject, String degree, int experience, String contuctNum) {
            super(name, subject, degree, experience, contuctNum);
            age = 25;
        }

    }

    class PianoTeacher extends Teacher {


        PianoTeacher(String name, String subject, String degree, int experience, String contactNum) {
            super(name, subject, degree, experience, contactNum);
        }


    }


