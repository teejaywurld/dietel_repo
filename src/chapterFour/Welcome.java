package chapterFour;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi, enter your choice three numbers here: ");
            double firstNumber = input.nextDouble();
            double secondNumber = input.nextDouble();
            double thirdNumber = input.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average of " + firstNumber + secondNumber + thirdNumber + " is " + average );
        }
}
