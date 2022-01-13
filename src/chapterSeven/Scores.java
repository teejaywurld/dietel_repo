package chapterSeven;

    // An application that asks the user to enter 10 scores,
// Displays the entire number entered by the user,
// Prints out the total scores,
// Prints out the average scores,
// Prints out the maximum scores,
// Prints out the minimum scores,

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

    public class Scores {
        public static void main(String[] args) {
            int[] Scores = new int[10];

            int total = 0;
            int scores;
            int maximum = Integer.MIN_VALUE;
            int minimum = Integer.MAX_VALUE;
            double average;
            int numberCounter;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your score here: ");
            for (numberCounter = 0;numberCounter <= Scores.length; numberCounter++) {

                scores = input.nextInt();
                total += scores;


                if (scores > maximum)
                    maximum = scores;

                if (scores < minimum)
                    minimum = scores;
            }
            average = total/10;


            System.out.println(minimum);
            System.out.println(maximum);
            System.out.println(total);
            System.out.println(average);

        }
    }






    // to display
// for(int i = 0, i < scores.length; i++){
//System.out.println(scores[i] + " ");
//    }

    // maximum
    // int maximumnumber = scores[0];
// for (int i = 0; i < scores.length; i++){
//      maximumNumber = Math.max(maximumNumber, scores[i]);
//  }
    // System.out.println("Maximum is " + minimumNumber);

// sum
// int totalScore = 0;
//  for (int i = 0; i < scores.length; i++){
//      totalScore = totalScore + scores[i];
//      }
//          System.out.println("Total is " + totalScores);

//  average
//  double average = totalScores / (scores.length * 1.0);
// System.out.println("Average is " + average);
