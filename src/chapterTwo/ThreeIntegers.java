package chapterTwo;

import java.util.Scanner;

public class ThreeIntegers {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int number1;
            int number2;
            int number3;
            int sum;
            int average;
            int product;
            int smallest;
            int largest;

            System.out.print("Enter your first number here: ");
            number1 = input.nextInt();
            System.out.print("Great! enter your second number here: ");
            number2 = input.nextInt();
            System.out.print("Beautiful! enter your third number here: ");
            number3 = input.nextInt();

            largest = number1;
            if (number2 > largest)
                largest = number2;
            if (number3 > largest)
                largest = number3;

            smallest = number1;
            if (number2 < smallest)
                smallest = number2;
            if (number3 < smallest)
                smallest = number3;

            sum = number1 + number2 + number3;
            product = number1 * number2 * number3;
            average = sum / 3;

            System.out.printf("\nFor the numbers %d, %d and %d\n", number1, number2, number3);
            System.out.printf("Largest is %d\n", largest);
            System.out.printf("Smallest is %d\n", smallest);
            System.out.printf("Sum is %d\n", sum);
            System.out.printf("Product is %d\n", product);
            System.out.printf("Average is %d\n", average);

        }
    }
