package RedoneJavaExercises.ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger;
        int secondInteger;
        int sum, product, difference, quotient;

        System.out.print("Enter your first integer here: ");
        firstInteger = scanner.nextInt();

        System.out.print("Enter your second integer here: ");
        secondInteger = scanner.nextInt();

        sum = firstInteger + secondInteger;
        product = firstInteger * secondInteger;
        difference = firstInteger - secondInteger;
        quotient = firstInteger / secondInteger;

        System.out.println();

        System.out.printf("The sum of both numbers is: %d%n", sum);
        System.out.printf("The product of both entries is: %d%n", product);
        System.out.printf("The difference of both entries is: %d%n", difference);
        System.out.printf("The quotient of both entries is: %d%n", quotient);
    }
}
