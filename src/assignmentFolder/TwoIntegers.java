package assignmentFolder;

import java.util.Scanner;

public class TwoIntegers {
    // An application that asks the user to enter two integers,
// It obtains the input from the user,
// Display the larger number followed by the words "is larger"
// If the numbers are equal, print "These numbers are equal

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int firstNumber;
            int secondNumber;

            System.out.print("Enter your first number here: ");
            firstNumber = input.nextInt();
            System.out.print("Enter your second number here: ");
            secondNumber = input.nextInt();

            if (firstNumber > secondNumber){
                System.out.printf("%d is larger\n", firstNumber);}
            if (firstNumber == secondNumber){
                System.out.printf("These numbers are equal");}
            if(firstNumber < secondNumber){
                System.out.printf("%d is larger\n", secondNumber);


            }


            System.out.println();
        }
    }
