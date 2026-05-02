// abstraction
abstract class BackAccount {
    private double balance; // Encapsulation

    // Constructor
    BackAccount(double balance) {
        this.balance = balance;
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    public void deposite(double amount) {
        balance += amount;
    }

    // Abstract method (Abstraction)
    abstract void withdraw(double amount);
}

class SavingAccount extends BackAccount {
    SavingAccount(double balance) {
        super(balance);
    }

    // Polymorphism
    void withdraw(double amount) {
        if (amount <= getBalance()) {
            deposite(-amount);
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insuffiesent balance...");
        }
    }
}

public class Curd {
    public static void main(String[] args) {
        BackAccount acc = new SavingAccount(1000); // Polymorphism
        acc.deposite(500);
        acc.withdraw(300);

        System.out.println("Balance : " + acc.getBalance());
    }
}
