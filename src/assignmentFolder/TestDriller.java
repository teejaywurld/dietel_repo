package assignmentFolder;

import java.util.Scanner;

public class TestDriller {
        // An application that asks the reseller how many
// copies of CBT Software he wants to buy and outputs the amount
// he should pay in the value of thousands.

// if a reseller wants to buy between 1 to 4 copies of CBT Software,
// the displayed amount should be between 1,000 to 4,000.

// if a reseller wants to buy between 5 to 9 copies of CBT Software,
// the displayed amount should be between 5,000 to 9,000.

// if a reseller wants to buy between 10 to 29 copies of CBT Software,
// the displayed amount should be between 10,000 to 29,000.

// if a reseller wants to buy between 30 to 49 copies of CBT Software,
// the displayed amount should be between 30,000 to 49,000.

// if a reseller wants to buy between 50 to 99 copies of CBT Software,
// the displayed amount should be between 50,000 to 99,000.

// if a reseller wants to buy between 100 to 199 copies of CBT Software,
// the displayed amount should be between 100,000 to 199,000.

// if a reseller wants to buy between 200 to 499 copies of CBT Software,
// the displayed amount should be between 200,000 to 499,000.

// if a reseller wants to buy from 500 and above copies of CBT Software,
// the displayed amount should be from 500,000 and above


        public static void main(String[] args){
            Scanner reseller = new Scanner(System.in);

            int firstCost;
            int product;

            System.out.println("Hi there, how many copies will you like to buy?");
            firstCost = reseller.nextInt();

            if (firstCost >= 1){
                if (firstCost < 5){
                    System.out.printf("You are to pay %d%n", firstCost * 2000);
                }
            }

            if (firstCost >= 5){
                if (firstCost < 10){
                    System.out.printf("You are to pay %d%n", firstCost * 1800);
                }
            }

            if (firstCost >= 10){
                if (firstCost < 30){
                    System.out.printf("You are to pay %d%n", firstCost * 1600);
                }
            }

            if (firstCost >= 30){
                if (firstCost < 50){
                    System.out.printf("You are to pay %d%n", firstCost * 1500);
                }
            }

            if (firstCost >= 50){
                if (firstCost < 100){
                    System.out.printf("You are to pay %d%n", firstCost * 1300);
                }
            }

            if (firstCost >= 100){
                if (firstCost < 200){
                    System.out.printf("You are to pay %d%n", firstCost * 1200);
                }
            }

            if (firstCost >= 200){
                if (firstCost < 500){
                    System.out.printf("You are to pay %d%n", firstCost * 1100);
                }
            }

            if (firstCost >= 500){
                System.out.printf("You are to pay %d%n", firstCost * 1000);
            }


        }

    }
