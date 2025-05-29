package banking_system_simulator;
public class Institutional_Customer extends Customer {
    
    private String type;
    private String sector;
    private double annualRevenue;

    public String getType() {
        return type;
    }

    public String getSector() {
        return sector;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public int getInstutionalCounter() {
        return instutionalCounter;
    }
    private int instutionalCounter;
    
    public Institutional_Customer(String name, String adress, String contactDetails, String type, String sector, double annualRevenue){
        super(name, adress,contactDetails);
        this.type = type;
        this.sector = sector;
        this.annualRevenue = annualRevenue;
        instutionalCounter++;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Type:  " + type + " Sector: " + sector;
    }
    
}
