package chapterTwo;

import java.util.Scanner;

public class Applications {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number1;
            int number2;
            int sum, product, difference, quotient;

            System.out.print("Enter your first number: ");
            number1 = input.nextInt();
            System.out.print("Enter your second number: ");
            number2 = input.nextInt();

            System.out.printf("The answer is: ");
            System.out.printf("\nSum is %d%n", number1 + number2);
            System.out.printf("Product is %d%n", number1 * number2);
            System.out.printf("Difference is %d%n", number1 - number2);
            System.out.printf("Quotient is %d%n", number1 / number2);
            System.out.printf("The answer is: ");
        }
    }
