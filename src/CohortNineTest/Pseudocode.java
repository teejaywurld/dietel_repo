package CohortNineTest;

import java.util.Scanner;

public class Pseudocode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentScore = 0;

        System.out.print("Enter your score here: ");
        int testScore = scanner.nextInt();

        if (testScore > 96)
            if (testScore >= 100)
                System.out.print("Your score is A");

        else
                System.out.println("You failed");
    }
}
