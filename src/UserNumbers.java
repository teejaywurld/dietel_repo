import java.util.Scanner;

public class UserNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (gradeCounter <= 10) {
            System.out.print("Enter your grade here: ");
            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        for (int i = 0; i < 10; ++i){
            int grade = scanner.nextInt();
                if(grade > max)
                    max = grade;
                if (grade < min)
                    min = grade;
        }

        int average = total / 10;

        System.out.printf("%n Total is %d%n", total);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The maximum number is %d%n", + max);
        System.out.printf("The minimum number is %d%n", + min);
    }
}
