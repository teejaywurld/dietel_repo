package chapterFour;

import java.util.Scanner;

public class SentinelAssignment {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            int count = 1;
            int minimum;
            int maximum;
            int sum = 0;
            double average;
            System.out.println("Enter your preferred number here: ");
            number = input.nextInt();
            maximum = number;
            minimum = number;

            do {
                sum = sum + number; count++;
                if (maximum < number){
                    maximum = number;
                }
                if (minimum > number){
                    minimum = number;
                }
            }
            while ((number = input.nextInt()) != -42);


            average = sum / (count * 1.0);
            System.out.printf("The sum is %d%n", sum);
            System.out.printf("The minimum is %d%n", minimum);
            System.out.printf("The maximum is %d%n", maximum);
            System.out.printf("The average is %.2f%n", average);

        }
    }
