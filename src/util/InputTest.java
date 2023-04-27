
package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Please enter a string: ");
        String str = input.getString();
        System.out.println("You entered: " + str);

        System.out.print("Please enter 'y' or 'n': ");
        boolean yesNo = input.yesNo();
        System.out.println("You entered: " + yesNo);

        System.out.print("Please enter an integer between 1 and 10: ");
        int intInRange = input.getInt(1, 10);
        System.out.println("You entered: " + intInRange);

        System.out.print("Please enter an integer: ");
        int intNum = input.getInt();
        System.out.println("You entered: " + intNum);

        System.out.print("Please enter a decimal number between 0.0 and 1.0: ");
        double doubleInRange = input.getDouble(0.0, 1.0);
        System.out.println("You entered: " + doubleInRange);

        System.out.print("Please enter a decimal number: ");
        double doubleNum = input.getDouble();
        System.out.println("You entered: " + doubleNum);
    }
}
