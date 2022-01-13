package assignmentFolder;

public class _Math {
    public double power (double number, int exponent){
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }
}
