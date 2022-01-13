package chapterFour;

import java.util.Scanner;

public class AvgMaxMinNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your choice 10 numbers here: ");
            int numbers = input.nextInt();

            int total = 0;
            int count = 1;
            double average;
            int numberCounter = 1;
            int maximum = numbers;
            int minimum = numbers;

            while (count <= 10) {

                total = total + numbers;
                numbers = input.nextInt();
                count++;
                if (minimum > numbers) {
                    minimum = numbers;
                }
                if (maximum < numbers) {
                    maximum = numbers;
                }
            }

            average = total / numbers;
            System.out.printf("%2f is average %n", average);
            System.out.printf("%d is minimum %n", minimum);
            System.out.printf("%d is maximum %n", maximum);

        }

    }
