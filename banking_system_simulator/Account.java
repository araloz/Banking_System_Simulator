package banking_system_simulator;
import java.util.ArrayList;

public class Account {
    
    private int accountNo;
    private static int count = 1;
    private double balance = 0.0;
    private Customer owner;
    private ArrayList<Double> history = new ArrayList<>();
    private ArrayList<Double> lastTwoTransaction = new ArrayList<>();
    
    public Account(Customer owner){
        this.owner = owner;
        accountNo = count;
        count++;
    }
    
    public Account(double balance, Customer owner){
        this.owner = owner;
        this.balance = balance;
        accountNo = count;
        count++;
    }
    
    public double getBalance(){
        return this.balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public ArrayList<Double> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Double> history) {
        this.history = history;
    }

    public ArrayList<Double> getLastTwoTransaction() {
        return lastTwoTransaction;
    }

    public void setLastTwoTransaction(ArrayList<Double> lastTwoTransaction) {
        this.lastTwoTransaction = lastTwoTransaction;
    }
    
    public void setBalance(double amount){
        history.add(amount);
        this.balance += amount;
    }
    
    public void addToHistory(double a){
        this.history.add(a);
    }
    
    public void addToLastTransactions(double a){
        lastTwoTransaction.set(0, lastTwoTransaction.get(1));
        lastTwoTransaction.set(1, a);
    }
    
    public Customer getOwner(){
        return this.owner;
    }
    
    public String getOwnerName(){
        return this.owner.getName();
    }
    
    public void deposit(double money){
        balance += money;
    }
    
    public void withdraw(double money){
        balance += -money;
    }
    
    @Override
    public String toString(){
        return "Your account number is: " + this.accountNo + " Your current balance is: "
                + this.balance + " The owner of this accout is: " + this.owner +
                " Your transaction history is: " + lastTwoTransaction.toString();
    }
    
}
