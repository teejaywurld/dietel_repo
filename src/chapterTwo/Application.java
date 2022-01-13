package chapterTwo;

import java.util.Scanner;

public class Application {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number1;
            int number2;

            System.out.print("Enter your first number here: ");
            number1 = input.nextInt();
            System.out.print("Great! enter your second number here: ");
            number2 = input.nextInt();

            if (number1 == number2)
                System.out.printf("These numbers are equal");
            if (number1 > number2)
                System.out.printf("%d is larger\n", number1);
            if (number1 < number2)
                System.out.printf("%d is larger\n", number2);

        }
    }
