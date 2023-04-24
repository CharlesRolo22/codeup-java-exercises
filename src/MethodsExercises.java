//import java.util.Scanner;
//
//public class MethodsExercises {
////
//    public static int addition(int a, int b) {
//        return a + b;
//    }
//
//    public static int subtraction(int a, int b) {
//        return a - b;
//    }
//
//    public static int multiplication(int a, int b) {
//        return a * b;
//    }
//
//    public static int division(int a, int b) {
//            return a / b;
//        }
//    }
//
//    public static int modulus(int a, int b) {
//        return a % b;
//    }
//
//    public static void main(String[] args) {
//        int a = 6;
//        int b = 22;
//        System.out.println("Addition: " + addition(a, b));
//        System.out.println("Subtraction: " + subtraction(a, b));
//        System.out.println("Multiplication: " + multiplication(a, b));
//        System.out.println("Division: " + division(a, b));
//        System.out.println("Modulus: " + modulus(a, b));
//    }

//    public static void main(String[] args) {
//        int min = 1;
//        int max = 100;
//        int validInput = getValidInput(min, max);
//        System.out.println("Valid input: " + validInput);
//        System.out.println(factorial());
//    }
//
//    public static int getValidInput(int min, int max) {
//
//        Scanner scanner = new Scanner(System.in);
//        int input = 0;
//        boolean validInput = false;
//        while (!validInput) {
//            System.out.print("Enter a number between " + min + " and " + max + ": ");
//            String inputString = scanner.nextLine();
//            try {
//                input = Integer.parseInt(inputString);
//                if (input >= min && input <= max) {
//                    validInput = true;
//                } else {
//                    System.out.println("Error: input must be between " + min + " and " + max);
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Error: input must be a valid integer");
//            }
//        }
//        return input;
//
//
//
//
//    public static long factorial(){
//        int userFactorial = getValidInput(1, 10);
//        long startNumber = 1;
//        for(int i = 1; i <= userFactorial; i++){
//            startNumber *= i;
//        }
//    }
//
//}
//
//public static boolean userContinue(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Would you like to continue? (y/n)");
//        String answer = scanner.nextLine();
//        if (answer.equals("y")){
//            return true;
//
//        }
//    }
//
//    public static int dice(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("how many sides do your dice has?");
//        int sides = scanner.nextInt();
//        int dice1 = (int) ((Math.random() * sides) * 1);
//        int dice2 = (int) ((Math.random() * sides) * 1);
//
//        return dice1 + dice2;
//    }
//
}