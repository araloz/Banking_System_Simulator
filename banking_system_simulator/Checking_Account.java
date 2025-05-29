package banking_system_simulator;
public class Checking_Account extends Account {
    
    private final int AIR = 3;
    private boolean debitCard;
    private boolean ATMAccess;
    private boolean OBA;
    
    Checking_Account(Customer owner){
        super(owner);
        countCA++;
    }
    
    Checking_Account(double balance, Customer owner){
        super(balance, owner);
        countCA++;
    }
    
    public int getAIR() {
        return AIR;
    }

    public int getCountCA() {
        return countCA;
    }

    public boolean isDebitCard() {
        return debitCard;
    }

    public void setDebitCard(boolean debitCard) {
        this.debitCard = debitCard;
    }

    public boolean isATMAccess() {
        return ATMAccess;
    }

    public void setATMAccess(boolean ATMAccess) {
        this.ATMAccess = ATMAccess;
    }

    public boolean isOBA() {
        return OBA;
    }

    public void setOBA(boolean OBA) {
        this.OBA = OBA;
    }
    private int countCA;
    
    public double oneYearInterest(){
        return this.getBalance()*12*AIR;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Is a debitcard:" + debitCard +  
                " Does have ATM access: " + ATMAccess + " Does have OBA: " + OBA;
    }
    
}
