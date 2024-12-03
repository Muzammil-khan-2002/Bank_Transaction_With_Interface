
/*
	Q4 -Create an interface Transaction with methods deposit() and withdraw(). 
	Implement this interface in SavingsAccount and CurrentAccount.
*/

import java.util.*;

interface Transaction {
    void deposit(double depositAmount);
    void withdraw(double amount);
}

class SavingsAccount implements Transaction {
    double balance = 0;

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Successfully deposited " + depositAmount + " Rupees in your Savings Account.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " Rupees successful from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }
}

class CurrentAccount implements Transaction {
    double balance = 0;

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Successfully deposited " + depositAmount + " Rupees in your Current Account.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " Rupees successful from Current Account.\nAvailable Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Current Account!");
        }
    }
}

class BankMachine {
    void setAccount(Transaction t, double depositAmount, double amount) {
        t.deposit(depositAmount);
        t.withdraw(amount);
    }
}

class BankingServiceApp {
    public static void main(String args[]) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("1 - Savings Account");
        System.out.println("2 - Current Account");
        System.out.println("Enter Choice:");
        int choice = xyz.nextInt();

        BankMachine bm = new BankMachine();

        System.out.println("Enter deposit amount:");
        double balance = xyz.nextDouble();
        System.out.println("Enter withdrawal amount:");
        double amount = xyz.nextDouble();

        Transaction t = null; // Declare reference variable here
        switch (choice) {
            case 1:
                t = new SavingsAccount();
                bm.setAccount(t, balance, amount);
                break;
            case 2:
                t = new CurrentAccount();
                bm.setAccount(t, balance, amount);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        xyz.close(); // Close the scanner
    }
}
