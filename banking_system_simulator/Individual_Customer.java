package banking_system_simulator;
public class Individual_Customer extends Customer {
    
    private String gender;
    private int identificationNO;
    private static int count = 1;
    private String occupation;
    private int personCounter;
    
    public Individual_Customer(String name, String adress, String contactDetails, String gender, String occupation){
        super(name, adress,contactDetails);
        this.gender = gender;
        this.occupation = occupation;
        this.identificationNO = count;
        count++;
        personCounter++;
    }

    public String getGender() {
        return gender;
    }

    public int getIdentificationNO() {
        return identificationNO;
    }

    public int getPersonCounter() {
        return personCounter;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Gender: " + gender + " Identification number: "
                + identificationNO + " Occupation: " + occupation;
    }
    
}
