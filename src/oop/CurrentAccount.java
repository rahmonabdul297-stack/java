package oop;

public class CurrentAccount extends BankAccount {
    private static final double miniBal = -20000.00;

    CurrentAccount(String accountName, String accountNumber, double bal) {
        super(accountName, accountNumber, bal);
    }

    @Override
    public double withdraw(double amount) {
        double bal = getBalance() - amount;
        setBal(bal);
        if (amount > 0) {
            // Allow overdraft down to -$20,000
            if (bal >= miniBal) {

                System.out.println("Successfully withdrew $" + amount);
                if (bal < 0) {
                    System.out.println("Your current dept is $" + bal);
                } else {
                    System.out.println("Your remain balance is $" + bal);
                }
            } else {
                System.out.println("Withdrawal failed: Exceeds the maximum overdraft limit of $20,000.");

            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
        return 0.0;
    }
}
