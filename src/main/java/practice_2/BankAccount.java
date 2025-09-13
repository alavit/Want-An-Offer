package main.java.practice_2;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return this.owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdaw(double amount) {
        this.balance -= amount;
    }

    void printBalance() {
        System.out.println("Balance: " + this.getBalance());
    }
}
