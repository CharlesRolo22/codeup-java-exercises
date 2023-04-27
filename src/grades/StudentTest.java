package grades;


public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Charles");
        Student student2 = new Student("Amina");

        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(95);

        student2.addGrade(75);
        student2.addGrade(80);
        student2.addGrade(85);

        System.out.println(student1.getName() + "'s average grade is " + student1.getGradeAverage());
        System.out.println(student2.getName() + "'s average grade is " + student2.getGradeAverage());
    }
}