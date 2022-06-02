package RedoneJavaExercises.ChapterFour;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = scanner.nextInt();

            if (result == 1)
                passes += 1;
            else
                failures += 1;
            studentCounter += 1;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes >= 8)
            System.out.println("Bonus to instructor!");
    }
}

