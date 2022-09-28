package ca.umontreal.iro.demo2.demo.sansHeritage;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this(0);
    }

    private BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    public double getBalance() {
        return balance;
    }
}

