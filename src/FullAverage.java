import java.util.Scanner;

public class FullAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

 while (gradeCounter <= 10) {
     System.out.print("Enter your grade here: ");
     int grade = scanner.nextInt();
     total = total + grade;
     gradeCounter = gradeCounter + 1;
 }
        int average = total / 10;

        System.out.printf("%n Total is %d%n", total);
        System.out.printf("The average is %d%n", average);

    }
}
