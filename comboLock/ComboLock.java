

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int locationDial;
    private int num1;
    private int num2;
    private int num3;
    /**
     * Default constructor for objects of class ComboLock
     */
    public ComboLock(int secret1,int secret2, int secret3)
    {
        // initialise instance variables
         num1= secret1;
         num2= secret2;
         num3= secret3;
        locationDial= 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void reset()
    {
        // put your code here
        this.locationDial= 0;
    }
    public void turnLeft(int ticks)
    {
        for(int i = 0; i<ticks;i++)
        {
            locationDial++;
            if(locationDial>=40)
            {
                locationDial = locationDial-40;
                
            }
        }
    }
    public int dialPosition()
    {
        return locationDial;
    }
    public void turnRight(int ticks)
    {
        locationDial+= (40-ticks);
    }
    public boolean open()
    {
        if (turnLeft(num1)== locationDial )
        {
            if(turnRight(num2)== locationDial)
            {
                if(turnLeft(num3)== locationDial)
                {
                    return true;
                }
            }
        }
        else
        {
            return false;
        }
    }
}
