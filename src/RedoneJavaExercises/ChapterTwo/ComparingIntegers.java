package RedoneJavaExercises.ChapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter your first number here: ");
        int firstEntry = scanner.nextInt();

        System.out.print("Enter your second number here: ");
        int secondEntry = scanner.nextInt();

        if (firstEntry > secondEntry)
            System.out.print("The first number you entered is larger");

        if (secondEntry > firstEntry)
            System.out.print("The second number you entered is larger");

        if (firstEntry == secondEntry)
            System.out.print("These numbers are equal");

        System.out.println();
    }
}
