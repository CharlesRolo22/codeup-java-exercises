import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately" + "\n" + pi);

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int num = scanner.nextInt();


        System.out.println("You entered " + num);

        System.out.print("Enter word 1: ");
        String word1 = scanner.next();

        System.out.print("Enter word 2: ");
        String word2 = scanner.next();

        System.out.print("Enter word 3: ");
        String word3 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");

        String sentence = scanner1.nextLine();

        System.out.println("You entered: " + sentence);

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");

        String lengthString = scanner2.nextLine();

        double length = Double.parseDouble(lengthString);

        System.out.print("Enter the width of the room: ");

        String widthString = scanner2.nextLine();

        double width = Double.parseDouble(widthString);

        double area = length * width;

        System.out.println("The area of the room: " + area);

        double perimeter = 2 * (length + width);

        System.out.println("The perimeter of the room: " + perimeter);
    }

}
