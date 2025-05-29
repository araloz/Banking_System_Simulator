package banking_system_simulator;
public class Test {
    public static void main(String[] args) {
        
        Transaction transaction1 = new Transaction();
        Individual_Customer Aral = new Individual_Customer("Aral", "İstanbul","0532", "male", "student");
        Financial_Portfolio AralsPortfolio = new Financial_Portfolio(Aral);
        Checking_Account AralsCA = new Checking_Account(100000.0, Aral);
        Savings_Account AralsSA1 = new Savings_Account(1000.0,Aral);
        Savings_Account AralsSA2 = new Savings_Account(1000.0,Aral);
        
        AralsPortfolio.addAccount(AralsSA1);
        AralsPortfolio.addAccount(AralsSA2);
        
        AralsCA.deposit(100.0);
        AralsCA.deposit(700.0);
        AralsCA.deposit(50.0);
        
        transaction1.deposit(AralsCA, 100.0);
        
        AralsCA.toString();
        AralsSA1.toString();
        AralsSA2.toString();
        
        AralsPortfolio.totalValueOfPortfolio();
        AralsPortfolio.removeAccount(AralsSA2);
        
        AralsPortfolio.totalValueOfPortfolio();
        
        AralsPortfolio.allAccountsInPortfolio();
        
        Individual_Customer Ata = new Individual_Customer("Ata", "İstanbul","0537", "male", "student");
        Financial_Portfolio AtasPortfolio = new Financial_Portfolio(Ata);
        Checking_Account AtasCA = new Checking_Account(300000.0, Ata);
        
        AtasCA.toString();
        
        AtasPortfolio.addAccount(AtasCA);
        
        AtasPortfolio.totalValueOfPortfolio();
        AtasPortfolio.allAccountsInPortfolio();
        
        AtasPortfolio.comparePortfolios(AralsPortfolio);
        
        Transaction transaction2 = new Transaction();
        transaction2.deposit(AtasCA, 300.0);
        
        Transaction transaction3 = new Transaction();
        transaction3.transferTo(AtasCA, AralsCA, 150.0);
        
        AralsCA.toString();
        AralsSA1.toString();
        AralsSA2.toString();
        AtasCA.toString();
        
        AtasPortfolio.comparePortfolios(AralsPortfolio);
        
        
    }
}
