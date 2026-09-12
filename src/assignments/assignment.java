package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner enterName = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = enterName.nextLine();
        Scanner enterAccountBal = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
        double balance = enterAccountBal.nextDouble();
        Scanner enterExpense = new Scanner(System.in);
        System.out.print("Enter your expenses: ");
        int expenses = enterExpense.nextInt();
        double[] expensesList = {};
        double[] addExpensesToexpensesList = new double[expensesList.length + 1];
        for (int idx = 0; idx < expensesList.length; idx++) {
            addExpensesToexpensesList[idx] = expensesList[idx];
        }
        addExpensesToexpensesList[expensesList.length] = expenses;
        expensesList = addExpensesToexpensesList;
        
    // Total expenses
    double totalExp=expensesList[0];
    for(int exp=0; exp <expensesList.length;exp++){
        expensesList[exp]=totalExp;
    }
         int totalXpenses= expensesList.length;

        System.out.println("Dear," + fullName + "!\n" + "Your initial account balance is:" + balance + "\n");
        enterAccountBal.close();
        enterName.close();
        enterExpense.close();
    }
}
