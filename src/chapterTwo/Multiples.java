package chapterTwo;

import java.util.Scanner;

public class Multiples {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int firstNumber;
            int secondNumber;

            System.out.println("Hi, enter your preferred number here: ");
            firstNumber = input.nextInt();
            System.out.println("Input your second number here: ");
            secondNumber = input.nextInt();

            if (firstNumber % secondNumber == 0)
                System.out.printf("%d is a multiple of %d%n", firstNumber, secondNumber);
            if (firstNumber % secondNumber != 0)
                System.out.printf("%d is not a multiple of %d%n", firstNumber, secondNumber);


        }
    }
