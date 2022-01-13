package chapterSeven;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] ticTacToe = {{'X', 'O', 'O'}, {'X', 'X', 'X'}, {'O', 'X', 'O'}};

        for (char[] TacToe : ticTacToe) {
            for (char innerArray : TacToe) {
                System.out.print(innerArray + " ");
            }
            System.out.println();
        }
    }
}
