import java.util.Scanner;
public class bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;


        do {
            System.out.print("You: ");
            input = scanner.nextLine();

            if (input.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (input.trim().isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }
        } while (!input.equalsIgnoreCase("bye"));

    }
}
