package Bank;
public class BankAccout {
    int pin = 1234;
    String accountName;
    String accountNumber;
    double balance;
    BankAccout(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    double currentBalance;
    public void deposit(double Amount) {
        currentBalance = Amount + balance;
    }
    double remainBal;
    public void withdraw(double amount, int withdrawalPin) {
        if (withdrawalPin != pin) {
            System.out.println("Incorrect Pin, Try again!");
        } else {
            remainBal = currentBalance - amount;
        }

    }
    public void displayAccount() {
        System.out.println("initial Bal: " + balance);
        System.out.println("Bal after depositing: " + currentBalance);
        System.out.println("Remaining Balance: " + remainBal);
    }
    public static void main(String[] args) {
        BankAccout Client = new BankAccout("ABDUL RAHMON", "2367007948", 2000.00);
        Client.deposit(4000.40);
        Client.withdraw(500, 4321);
        Client.displayAccount();
    }
}
