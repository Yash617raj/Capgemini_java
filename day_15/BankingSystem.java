/*
    Banking System (Main Question)
    - Create an interface BankOperations with methods deposit(), withdraw(), and checkBalance().
    - Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.
    - Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).
    - Store multiple accounts in an ArrayList<Account>.
    Demonstrate runtime polymorphism while performing operations.
        Add features:
        Add a new account
        Remove an account by account number
        Search for an account
        Display all accounts
        Deposit/Withdraw money into/from a chosen account
*/

import java.util.ArrayList;

interface BankOperation{
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

abstract class Account{
    int accountNo;
    String holderName;
    double balance;

    Account(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract void displayAccount();
}

class SavingsAccount extends Account implements BankOperation{
    SavingsAccount(int accountNo,String holderName,double balance){
        super(accountNo, holderName, accountNo);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited in the Saving account");
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Amount Withdrawn from the Saving account");
        }
        else System.out.println("Balance is not sufficient");
    }

    public void checkBalance(){
        System.out.println("Current Balance is: "+balance);
    }
    public void displayAccount(){
        System.out.println("Savings | AccNo: " + accountNo +" | Name: " + holderName +" | Balance: " + balance);
    }

}
class CurrentAccount extends Account implements BankOperation{
    CurrentAccount(int accountNo,String holderName,double balance){
        super(accountNo, holderName, accountNo);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited in the Current account");
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Amount Withdrawn from the current account");
        }
        else System.out.println("Balance is not sufficient");
    }

    public void checkBalance(){
        System.out.println("Current Balance is: "+balance);
    }
    public void displayAccount(){
        System.out.println("Current | AccNo: " + accountNo +" | Name: " + holderName +" | Balance: " + balance);
    }
}
public class BankingSystem {
    static ArrayList<Account> accounts = new ArrayList<>();
    public static void main(String[] args) {
        accounts.add(new SavingsAccount(101, "Aman", 5000));
        accounts.add(new CurrentAccount(102, "Riya", 8000));
        displayAllAccounts();

        Account acc = searchAccount(101);
        if (acc != null) {
            BankOperation bo = (BankOperation) acc; 
            bo.deposit(2000);
            bo.withdraw(1000);
            bo.checkBalance();
        }

        removeAccount(102);
        displayAllAccounts();
    }

    static Account searchAccount(int accNo) {
        for (Account a : accounts) {
            if (a.accountNo == accNo)
                return a;
        }
        System.out.println("Account not found");
        return null;
    }

    static void removeAccount(int accNo) {
        Account acc = searchAccount(accNo);
        if (acc != null) {
            accounts.remove(acc);
            System.out.println("Account removed");
        }
    }

    static void displayAllAccounts() {
        System.out.println("\n--- All Accounts ---");
        for (Account a : accounts) {
            a.displayAccount();
        }
    }
    
}


