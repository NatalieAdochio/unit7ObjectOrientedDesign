
/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    private String idNumber;
    public IDCard(String n, String id)
    {  
        super(n);
        idNumber = id;
    }

    public String format()
    {
        return "Card Holder: "+ this.getName() +"\t ID Number: "+idNumber+"\n";
    }
    //override the equal method defined in Card as well as ObjectWHAT THIS IS!!!!
    public boolean equals( IDCard otherCard)
    {
        //check if this object and the other are both of the same calss
        if(this.getClass()== otherCard.getClass())
        {
            //first check if equal from perspective of the superclass(Card)
            boolean isEqual = super.equals( otherCard);
            //second cast the other object to an IDCard to see if nums equal
            IDCard otherIDCard = (IDCard) otherCard;
            return isEqual && this.idNumber.equals(otherCard.idNumber);
            
        }
        return false;
    }
}
