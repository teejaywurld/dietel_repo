package RedoneJavaExercises.ChapterTwo;

import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter your first number here: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter your second number here: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter your third number here: ");
        int thirdNumber = scanner.nextInt();

        int result = firstNumber * secondNumber * thirdNumber;

        System.out.printf("The value of your numbers is: %d%n", result);
    }
}
