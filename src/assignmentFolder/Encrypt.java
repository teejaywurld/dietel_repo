package assignmentFolder;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
         int newNumber, fourDigit, count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your four digit number here: ");
             //int encrypt = input.nextInt();
                newNumber = input.nextInt();
              //  if (newNumber, fourDigit, count = 0);
            //while (newNumber > 0){
        if (newNumber >= 0){
        fourDigit = (newNumber % 10) + 7;
            System.out.println(fourDigit);
            newNumber = newNumber / 10;
        }

        }
       // System.out.println(newNumber);


    }


    //int a,i,count=0;

    //Scanner s= new Scanner(System.in);

// System.out.println("Enter a number");

   //     a=s.nextInt();

     //   while (a > 0) {

       // i= a % 10;

        // System.out.println(i);

        // a = a / 10;
