package chapterFour;

import java.util.Scanner;

public class Uber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int number = input.nextInt();
        System.out.print("Factors of this number are: ");

        System.out.println("\n".repeat(50));


        for (int factors = 1; factors <= number; factors++) {
            if (number % factors == 0) {
                System.out.print(factors + " ");
            }
        }
    }
}
