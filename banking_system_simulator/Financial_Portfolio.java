package banking_system_simulator;

import java.util.ArrayList;

public class Financial_Portfolio{
    private Customer owner;
    private Account account;
    private ArrayList<Account> accountPortfolio = new ArrayList<>();
    
    public Financial_Portfolio(Customer owner){
        this.owner = owner;
    }
    
    public String addAccount(Account account){
        this.accountPortfolio.add(account);
        return "Account succesfuly added.";
    }
    
    public String removeAccount(Account account){
        if(this.accountPortfolio.contains(account)){
            int a = this.accountPortfolio.indexOf(account);
            this.accountPortfolio.remove(a);
            return "Account succesfuly deleted.";
        }
        return "There is no such account to delete.";
        }
    
    public double totalValueOfPortfolio(){
        double total = 0;
        for (int i = 0; i < this.accountPortfolio.size(); i++) {
            total += this.accountPortfolio.get(i).getBalance();
        }
        return total;
    }
    
    public void allAccountsInPortfolio(){
        for (int i = 0; i < this.accountPortfolio.size(); i++) {
            System.out.println(this.accountPortfolio.get(i) + " balance: " + 
                    this.accountPortfolio.get(i).getBalance());
        }
    }
    
    public String comparePortfolios(Financial_Portfolio p2){
        if(this.totalValueOfPortfolio() == p2.totalValueOfPortfolio()){
            return "These portfolios have the same balance.";
        }
        return "These portfolios are not equal in balance.";
    }

    public String getOwner() {
        return owner.getName();
    }

    public int getAccount() {
        return account.getAccountNo();
    }
    
}
