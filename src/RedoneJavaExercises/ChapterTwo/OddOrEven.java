package RedoneJavaExercises.ChapterTwo;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entry;

        System.out.println();

        System.out.print("Input your entry here: ");
        entry = scanner.nextInt();

        System.out.println();

        if ( entry % 2 == 0)
            System.out.println("The number you entered is an even number");

        if ( entry % 2 != 0)
            System.out.println("The number you entered is an odd number");

        System.out.println();
    }
}
