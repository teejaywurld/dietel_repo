package chapterFour;

public class OddNumbering {
        public static void main(String[] args) {
            int number = 0;

            while(number < 100){
                number++;
                if(number % 2 == 0)
                    System.out.printf("Even number: %d%n", number);
                else
                if(number % 2 != 0)
                    System.out.printf("Odd number: %d%n", number);
            }
        }
}
