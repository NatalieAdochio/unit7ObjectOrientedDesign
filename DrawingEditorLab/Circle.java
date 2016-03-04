import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Ellipse2D.Double circle;
    
    /**
     * Default constructor for objects of class Circle
     */
    public Circle(double radius, Color color, double x, double y)
    {
        // initialise instance variables
        super(radius,color,x,y);
        circle = new Ellipse2D.Double(x-radius,y-radius,radius+radius,radius+radius);
    }

    public boolean isInside(Point2D.Double point)
    {
       boolean answer = false;
       double pointX= point.getX();
       double pointY= point.getY();
       answer=circle.contains(pointX,pointY);
       return answer;
    }
    
    public void draw(Graphics2D g2, boolean filled )
    {
        
        g2.draw(circle);
        if(filled==true)
        {
            g2.setColor(shapeColor);
            g2.fill(circle);
        }
    }

}
