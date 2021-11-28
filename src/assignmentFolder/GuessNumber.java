package assignmentFolder;

import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    public static void GuessNumber(){
        Scanner input = new Scanner(System.in);

        int number = 1 + (int)(1000 * Math.random());
        int trials = 10;
        int game, guess;

        System.out.println(
                "A number is chosen"
                + "between 1 to 1000."
                + "Guess the number"
                + "within 10 trials"
        );
        for (game = 0; game < 10; game++){
            System.out.println("Guess the number: ");

            guess = input.nextInt();
        }
    }
}
