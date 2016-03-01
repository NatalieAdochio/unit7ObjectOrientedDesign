import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Write a description of abstract class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private double xcenter;
    private double ycenter;
    private Color shapeColor;
    private double radii;
   
    /**
     * Default constructor for objects of class Shape
     */
    public Shape(double radius, Color color, double x, double y)
    {
        // initialise instance variables
        xcenter= x;
        ycenter=y;
        shapeColor=color;
        radii=radius;
       
    }

    /**
     * An example of an abstract method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public Point2D.Double getCenter()
    {
        Point2D.Double center = new Point2D.Double();
        center.setLocation(xcenter,ycenter);
        return center;
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
    public double getRadius()
    {
        // put your code here
        return radii;
    }
    public abstract boolean isInside(Point2D.Double point);
    public void move(double x,double y)
    {
        xcenter+=x;
        ycenter+=y;
    }
    public void setRadius(double r)
    {
        radii=r;
    }
    public abstract void draw(Graphics2D g2, boolean filled);
   
}
