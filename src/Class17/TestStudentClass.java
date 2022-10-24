package Class17;

public class TestStudentClass {
    public static void main(String[] args) {
        Students st1 = new Students("Jonny ", 86, 89, 78);
        st1.calculateAverageGrade();

        Students st2 = new Students("Allen", 89, 88, 90);
        st2.calculateAverageGrade();

        Students st3 = new Students("Jerry", 56, 45, 76);
        st3.calculateAverageGrade();
    }
}
