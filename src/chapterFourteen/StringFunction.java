package chapterFourteen;

// TODO Write a function that receives a string as an input and
// TODO it returns as an output the number of times the word
// TODO "Balloon" can be extracted

//i) Initialize 5 integers: b, a, l, o, and n to store their respective frequencies as
//ii)  For every character "chr" in the string:
//iii) If "chr" is any of the above-mentioned characters, increment its frequency
//iv) Divide L and O by 2
//v)  Return the minimum among b, a, l, o, and n
//vi) Print the result


public class StringFunction {
     public static void main(String[] args) {

         String letter = "BLLOONA";
         System.out.println(maxNumberOfBalloons(letter));
     }

    static int maxNumberOfBalloons(String letter) {
         int B = 0, A = 0, L = 0, O = 0, N = 0;
         char chr;

        for (int i = 0; i < letter.length(); i++) {
            chr = letter.charAt(i);

            switch (chr) {
                case 'B' : B++;
                case 'A' : A++;
                case 'L' : L++;
                case 'O' : O++;
                case 'N' : N++;
                default: ;
            }
        }
        L /= 2;
        O /= 2;
        return Math.min(B , Math.min(A , Math.min(L , (Math.min(L , Math.min(O , Math.min(O ,N)))))));
    }
}
