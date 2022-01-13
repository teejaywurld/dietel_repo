package chapterTwo;

import java.util.Scanner;

public class LargestSmallest {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int number1;
            int number2;
            int number3;
            int number4;
            int number5;

            int largest;
            int smallest;

            System.out.print("Hey, enter your first number here: ");
            number1 = input.nextInt();

            smallest = number1;
            largest = number1;

            System.out.print("Punch in your second number: ");
            number2 = input.nextInt();

            if (number2 < smallest)
                smallest = number2;

            if (number2 > largest)
                largest = number2;

            System.out.print("Welldone!, type in your next number: ");
            number3 = input.nextInt();

            if (number3 < smallest)
                smallest = number3;

            if (number3 > largest)
                largest = number3;

            System.out.print("Good job!, proceed with your fourth number: ");
            number4 = input.nextInt();

            if (number4 < smallest)
                smallest = number4;

            if (number4 > largest)
                largest = number4;

            System.out.print("Nice...please, write your next number: ");
            number5 = input.nextInt();

            if (number5 < smallest)
                smallest = number5;

            if (number5 > largest)
                largest = number5;

            System.out.printf("Numbers input: %d %d %d %d %d\n\n", number1, number2, number3, number4, number5);
            System.out.printf("Smallest number is %d\n", smallest);
            System.out.printf("Largest number is %d\n", largest);

        }
    }
