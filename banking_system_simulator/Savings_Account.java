package banking_system_simulator;
public class Savings_Account extends Account {
    
    private final double INTERESTRATE = 7.5;
    private String accountStatus;
    private static int countSA;
    
    Savings_Account(Customer owner){
        super(owner);
        countSA++;
        this.accountStatus = "Active";
    }
    
    Savings_Account(double balance, Customer owner){
        super(balance, owner);
        countSA++;
        this.accountStatus = "Active";
    }
    
    public double oneYearInterest(){
        return this.getBalance()*12*INTERESTRATE;
    }
    
    public boolean isEqual(Savings_Account a){
        if(a.getOwner() instanceof Individual_Customer == this.getOwner() instanceof Individual_Customer && this.getBalance() == a.getBalance()){
            return true;
        }
        return false;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Your account status is: " + this.accountStatus 
                + " Your balance after 1 year of interests is: " + 
                this.oneYearInterest();
    }
    
}
