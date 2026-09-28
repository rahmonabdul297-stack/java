package Input;
import javax.swing.JOptionPane;

public class SquareOperation {
    public static void main(String[] args) {
        int n1, n2, n3;
        double SQofSum;
        double SumOfSQ;

        String num1 = JOptionPane.showInputDialog("Enter first number: ");
        n1 = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog("Enter second number: ");
        n2 = Integer.parseInt(num2);

        String num3 = JOptionPane.showInputDialog("Enter third number: ");
        n3 = Integer.parseInt(num3);

        // n1 square
        int n1Square = n1 * n1;

        // n2 square
        int n2Square = n2 * n2;

        // n3 square
        int n3Square = n3 * n3;

        // sum
        int Sum = n1 + n2 + n3;

        // Square of sum
        SQofSum = Sum * Sum;

        // Sum of square
        SumOfSQ = n1Square + n2Square + n3Square;

        // output
        String title = "Square of sum and sum of square of three numbers";
        String display = "Square of sum: " + SQofSum + "\n Sum of square: " + SumOfSQ;

        JOptionPane.showMessageDialog(null, display, title, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}