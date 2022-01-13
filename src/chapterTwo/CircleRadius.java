package chapterTwo;

import java.util.Scanner;

public class CircleRadius {
        public static void main(String[] args){
            Scanner circle = new Scanner(System.in);

            System.out.println("Enter the radius: ");
            int radius = circle.nextInt();

            System.out.printf("The diameter is %d%n", 2 * radius);
            System.out.printf("The circumference is %.2f%n", 2 * Math.PI * radius);
            System.out.printf("The area is %.2f%n", Math.PI * radius * radius);


        }
    }
