package assignmentFolder;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

    public class GuessTheNumber {

        // Java program for the above approach

        // Function that implements the
        // number guessing game
        public static void GuessTheNumber()
        {
            // Scanner Class
            Scanner sc = new Scanner(System.in);

            int count = 0;

            // Generate the numbers
            int number = 1 + (int)(1000
                    * Math.random());

            // Given K trials
            int K = 10;

            int i, guess;

            System.out.println(
                    "A number is chosen"
                            + " between 1 to 1000."
                            + "Guess the number.");

            // Iterate over K Trials
            for (i = 0; i < K; i++) {

                System.out.println(
                        "Guess the number:");

                // Take input for guessing
                guess = sc.nextInt();

                count++;
                // If the number is guessed
                if (number == guess) {
                    System.out.println(
                            "Congratulations!"
                                    + " You guessed the number.");
                    break;
                }
                else if (number > guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is "
                                    + "greater than " + guess);
                }
                else if (number < guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is"
                                    + " less than " + guess);
                }
            }

            if (i == K) {
                System.out.println(
                        "You have exhausted"
                                + " your trials.");

                System.out.println(
                        "The number was " + number);
            }
            if (count <= 10){
                System.out.println("you know the secret!");
            }
            if (count >= 10){
                System.out.println("Aha! you know the secret!");
            }
            else {
                System.out.println("Congratulations, you are doing well!!!");
            }
        }

        // Driver Code
        public static void main (String [] args)
        {

            // Function Call
            GuessTheNumber();
        }
    }
