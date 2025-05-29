package banking_system_simulator;
public class Customer {
    
    private String name;
    private String adress;
    private String contactDetails;
    private int count;
    
    public Customer(String name, String adress, String contactDetails){
        this.name = name;
        this.adress = adress;
        this.contactDetails = contactDetails;
        count++;
    }
    
    public void updateContactDetails(String contactDetails){
        this.contactDetails = contactDetails;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
    
    @Override
    public String toString(){
        return "Owner's name: " + name + " Owner's adress: " + adress + 
                " Contact details: " + contactDetails;
    }
    
}
