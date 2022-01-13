package chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {
        public static void main(String[] args) {
            Scanner index = new Scanner(System.in);

            System.out.println("Enter the weight in kilograms: ");
            double weight = index.nextDouble();
            System.out.println("Enter the height in meters: ");
            double height = index.nextDouble();

            double bmi = weight / (height * height);

            if (bmi < 18.5) {
                System.out.println("Underweight");
            }

            if (bmi >= 18.5) {
                if (bmi <= 24.9) {
                    System.out.println("Normal");
                }
            }

            if (bmi >= 25) {
                if (bmi <= 29.9) {
                    System.out.println("Overweight");
                }
            }

            if (bmi > 30) {
                System.out.println("Obese");


            }
        }
    }
