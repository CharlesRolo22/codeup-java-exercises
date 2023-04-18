import java.util.Scanner;



public class ConsoleIOLec {
    public static void main(String[] args) {
        String name = "123";
        String cohortName = "Kotlin";
        System.out.println("Favorite number" + name);

        System.out.printf("Favorite number %s, and Favorite cohort is %s %n", name, cohortName);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the day today?");

        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.printf("You entered: %s", userInput +"\n");

        System.out.println("Enter Something: " + "\n");
        String userInput2 = scanner.nextLine();
        System.out.print("You entered: " + userInput2 + "\n");



    }
}
