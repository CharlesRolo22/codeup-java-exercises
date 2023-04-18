import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i + " ");
//
//            i++;

//        int i2 = 100;
//
//        do {
//            System.out.println(i2);
//            i2 -= 5;
//        } while (i2 >= -10);
//
//
//        }

//        for (int i = 1; i <= 100; i++) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (i % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (i % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(i);
//        }
//    }
//}

//        Scanner scanner = new Scanner(System.in);
//
//        do {
//
//            System.out.print("Enter an integer: ");
//            int n = scanner.nextInt();
//
//
//            System.out.println("Number\tSquare\tCube");
//            for (int i = 1; i <= n; i++) {
//                System.out.printf("%d\t%d\t%d\n", i, i * i, i * i * i);
//            }
//
//            System.out.print("Do you want to continue? (y/n): ");
//            String answer = scanner.next();
//
//            if (!answer.equalsIgnoreCase("y")) {
//                break;
//            }
//        } while (true);
//
//        scanner.close();

        Scanner input = new Scanner(System.in);
        char letterGrade;
        int numericalGrade;

                do {

                    System.out.print("Enter a numerical grade from 0 to 100: ");
                    numericalGrade = input.nextInt();


                    if (numericalGrade >= 88) {
                        letterGrade = 'A';
                    } else if (numericalGrade >= 80) {
                        letterGrade = 'B';
                    } else if (numericalGrade >= 67) {
                        letterGrade = 'C';
                    } else if (numericalGrade >= 60) {
                        letterGrade = 'D';
                    } else {
                        letterGrade = 'F';
                    }


                    System.out.printf("The letter grade for %d is %c.\n", numericalGrade, letterGrade);

                    System.out.print("Do you want to continue? (y/n) ");
                    String continuePrompt = input.next();
                    if (!continuePrompt.equalsIgnoreCase("y")) {
                        break;
                    }
                } while (true);

                input.close();
            }
        }

//    }
//
//}



//        }
//}
