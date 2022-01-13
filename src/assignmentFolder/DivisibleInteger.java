package assignmentFolder;

import java.util.Scanner;

public class DivisibleInteger {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter any number of your choice: ");
            int readNumber = input.nextInt();

            if (readNumber % 3 == 0)
                System.out.printf("The number you entered is divisible by 3");

            if (readNumber % 3 != 0)
                System.out.println("The number you entered is not divisible by 3");
        }

    }
