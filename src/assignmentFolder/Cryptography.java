package assignmentFolder;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number here: ");
              int number = input.nextInt();
            int firstdigit = number / 1000;
            int seconddigit = (number % 1000) / 100;
            int thirddigit = (number % 100) / 10;
            int fourthdigit = (number % 10) / 1;

            firstdigit = (firstdigit + 7) % 10;
            seconddigit = (seconddigit + 7) % 10;
            thirddigit = (thirddigit + 7) % 10;
            fourthdigit = (fourthdigit +7) % 10;

      //  System.out.printf("The encrypted data is %d%d%d%d", thirddigit, fourthdigit, firstdigit, seconddigit);

        int encrypt;
        encrypt = firstdigit;
        firstdigit = thirddigit;
        thirddigit = encrypt;

        encrypt = seconddigit;
        seconddigit = fourthdigit;
        fourthdigit = encrypt;



        // System.out.println(encrypt);
        System.out.printf("The encrypted data is %d%d%d%d ", firstdigit, seconddigit, thirddigit,fourthdigit);
   //     System.out.println(seconddigit);
    }
    }

