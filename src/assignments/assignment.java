package assignments;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner enterName = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = enterName.nextLine();
        Scanner enterAccountBal = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
        double balance = enterAccountBal.nextDouble();
        double[] expensesList = new double[10];

        do {
            for (int i = 0; i < 10; i++) {
                Scanner enterExpense = new Scanner(System.in);
                System.out.print("Enter your expenses(0 to stop adding): ");
                double expenses = enterExpense.nextDouble();
                if (expenses == 0) {
                    break;
                }
                double[] addExpensesToexpensesList = new double[expensesList.length + 1];

                for (int idx = 0; idx < expensesList.length; idx++) {
                    addExpensesToexpensesList[idx] = expensesList[idx];

                }
                addExpensesToexpensesList[expensesList.length] = expenses;
                expensesList = addExpensesToexpensesList;

            }
        } while (expensesList.length < 10);

        // Total expenses
        double totalExpenses = 0;
        for (int i = 0; i < expensesList.length; i++) {
            totalExpenses += expensesList[i];
        }
        // remaining Balance
        double remainingBalance = balance - totalExpenses;
        // Avg of exp
        double avg = totalExpenses / expensesList.length;
        // Largest exp
        double largestExp = expensesList[0];
        for (int xpIndx = 0; xpIndx < expensesList.length; xpIndx++) {
            if (expensesList[xpIndx] > largestExp) {
                largestExp = expensesList[xpIndx];
            }
        }
        // smallest exp
        double smallestExp = expensesList[0];
        for (int idx = 0; idx < expensesList.length; idx++) {
            if (expensesList[idx] < smallestExp) {
                smallestExp = expensesList[idx];
            }
        }
        System.out.println("Dear, " + fullName + "!\n" + "Your initial balance is: " + balance + "\n"
                + "Your total expenses is: " + totalExpenses + "\n" + "Your remaining balance is: " + remainingBalance
                + "\n" + "Your expenses average is: " + avg + "\n" + "Your Largest expenses is: " + largestExp + "\n"
                + "Your Smallest expenses is: " + smallestExp + "\n" + "Welcome onboard!");

        enterAccountBal.close();
        enterName.close();
        // enterExpense.close();

    }

}
