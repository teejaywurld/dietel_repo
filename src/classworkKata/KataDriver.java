package classworkKata;

// package chapterSix;

import java.util.Scanner;
public class KataDriver {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Score here");
            int grade = input.nextInt();

            String result = Kata.gradeChecker(grade);
            System.out.println(result);

        }}
