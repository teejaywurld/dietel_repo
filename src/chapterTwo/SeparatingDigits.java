package chapterTwo;

import java.util.Scanner;

public class SeparatingDigits {
        public static void main(String[] args){
            Scanner digits = new Scanner(System.in);

            int number = digits.nextInt();
            int firstDigit = number / 10000;
            System.out.println(firstDigit);
            int secondDigit = (number % 10000) / 1000;
            System.out.println(secondDigit);
            int thirdDigit = (number % 1000) / 100;
            System.out.println(thirdDigit);
            int fourthDigit = (number % 100) / 10;
            System.out.println(fourthDigit);
            int fifthDigit = (number % 10) / 1;
            System.out.println(fifthDigit);

            System.out.printf("%d %d %d %d %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);


        }
    }
