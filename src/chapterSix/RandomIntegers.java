package chapterSix;

import java.security.SecureRandom;

public class RandomIntegers {

        public static void main(String[] args) {
            // randomNumbers object will produce secure random numbers
            //SecureRandom randomNumbers = new SecureRandom();


            // loop 20 times
            for (int counter = 1; counter <= 20; counter++) {
                // pick random integer from 1 to 6
                // int face = 1 + randomNumbers.nextInt(6);
                random();
//             System.out.printf("%d ", face); // display generated value
                display(random());

                // if counter is divisible by 5, start a new line of output
                if (counter % 5 == 0) {
                    display("");
                }
            }


        }
        public static void display(String message){
            System.out.print(message);
        }
        public static void display(int message){
            System.out.print(message);
        }
        public static int random(){
            SecureRandom randomNumbers = new SecureRandom();
            int face = 1 + randomNumbers.nextInt(6);
            return face;
        }

    }
