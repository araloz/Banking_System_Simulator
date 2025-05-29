package banking_system_simulator;
import java.util.Date;
public class Transaction {
    
    private int ID;
    private double amount;
    private Date date;
    private String type;
    
    public Transaction(){
        
    }
    
    public void deposit(Account a, double amount){
        a.setBalance(amount);
        a.addToHistory(amount);
        a.addToLastTransactions(amount);
    }
    
    public void withdraw(Account a, double amount){
        a.setBalance(-1*amount);
        a.addToHistory(amount);
        a.addToLastTransactions(amount);
    }
    
    public void transferTo(Account a, Account b, double amount){
        a.setBalance(amount);
        b.setBalance(-1*amount);
        a.addToHistory(amount);
        a.addToLastTransactions(amount);
        b.addToHistory(amount);
        b.addToLastTransactions(amount);
    }
    
}
