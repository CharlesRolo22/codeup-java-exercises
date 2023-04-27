
package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = this.scanner.nextLine().toLowerCase();
        return (input.equals("y") || input.equals("yes"));
    }

    public int getInt(int min, int max) {
        int num = this.getInt();
        while (num < min || num > max) {
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            num = this.getInt();
        }
        return num;
    }

    public int getInt() {
        while (!this.scanner.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            this.scanner.nextLine();
        }
        int num = this.scanner.nextInt();
        this.scanner.nextLine();
        return num;
    }

    public double getDouble(double min, double max) {
        double num = this.getDouble();
        while (num < min || num > max) {
            System.out.printf("Please enter a number between %.2f and %.2f: ", min, max);
            num = this.getDouble();
        }
        return num;
    }

    public double getDouble() {
        while (!this.scanner.hasNextDouble()) {
            System.out.print("Please enter a valid decimal number: ");
            this.scanner.nextLine();
        }
        double num = this.scanner.nextDouble();
        this.scanner.nextLine();
        return num;
    }
}
