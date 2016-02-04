
/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int expirationYear;
    
    public DriverLicense(String n, int expiration)
    {  
        super(n);
        expirationYear=expiration;
    }

    public boolean isExpired()
    { 
        boolean expirationState=false;
       

    }

    public String format()
    {
        return "Card Holder: "+ this.getName() +"\t Expiration Date (YYYY): "+expirationYear+"\n";
    }
}
