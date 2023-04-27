package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student alice = new Student("Alice");
        alice.addGrade(90);
        alice.addGrade(85);
        alice.addGrade(95);
        students.put("aliceGitHubUsername", alice);

        Student bob = new Student("Bob");
        bob.addGrade(75);
        bob.addGrade(80);
        bob.addGrade(85);
        students.put("bobGitHubUsername", bob);

        Student charlie = new Student("Charlie");
        charlie.addGrade(95);
        charlie.addGrade(95);
        charlie.addGrade(100);
        students.put("charlieGitHubUsername", charlie);

        Student dave = new Student("Dave");
        dave.addGrade(70);
        dave.addGrade(65);
        dave.addGrade(75);
        students.put("daveGitHubUsername", dave);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which student would you like to see more information about? ");
        String inputUsername = scanner.next();

        if (students.containsKey(inputUsername)) {
            Student selectedStudent = students.get(inputUsername);
            System.out.println("Name: " + selectedStudent.getName());
            System.out.println("Grades: " + selectedStudent.getGrades());
            System.out.println("Average Grade: " + selectedStudent.getGradeAverage());
        } else {
            System.out.println("Sorry, no student was found with the GitHub username: " + inputUsername);
        }
    }
}

