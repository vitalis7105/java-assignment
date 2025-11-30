import java.util.Scanner;

// Superclass
class BankAccount {
    protected double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    public void addInterest() {
        balance = balance + (balance * 0.05); // Increase by 5%
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create SavingsAccount object
        SavingsAccount account = new SavingsAccount();

        // Get deposit amount from user
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        // Deposit money
        account.deposit(amount);

        // Apply 5% interest
        account.addInterest();

        // Display final balance
        System.out.println("Final balance after interest: " + account.balance);

    
    }
}
