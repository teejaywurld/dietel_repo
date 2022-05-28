package RedoneJavaExercises.ChapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Input your first number here: ");
        int firstEntry = scanner.nextInt();

        System.out.print("Input your second number here: ");
        int secondEntry = scanner.nextInt();

        System.out.print("Input your third number here: ");
        int thirdEntry = scanner.nextInt();

        System.out.print("Input your fourth number here: ");
        int fourthEntry = scanner.nextInt();

        System.out.print("Input your fifth number here: ");
        int fifthEntry = scanner.nextInt();

        System.out.println();

        int largest = firstEntry;
        if (secondEntry > largest)
            largest = secondEntry;
        if (thirdEntry > largest)
            largest = thirdEntry;
        if (fourthEntry > largest)
            largest = fourthEntry;
        if (fifthEntry > largest)
            largest = fifthEntry;

        int smallest = firstEntry;
        if (secondEntry < smallest)
            smallest = secondEntry;
        if (thirdEntry < smallest)
            smallest = thirdEntry;
        if (fourthEntry < smallest)
            smallest = fourthEntry;
        if (fifthEntry < smallest)
            smallest = fifthEntry;

        System.out.println();

        System.out.printf("The smallest number is: %d%n", smallest);
        System.out.printf("The largest number is: %d%n", largest);

        System.out.println();

    }
}
