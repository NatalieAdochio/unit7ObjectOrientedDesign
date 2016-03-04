import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle2D.Double square;
    /**
        /**
     * Default constructor for objects of class Circle
     */
    public Square(double radius, Color color, double x, double y)
    {
        // initialise instance variables
        super(radius,color,x,y);

        square = new Rectangle2D.Double(x-radius,y-radius,radius+radius,radius+radius);
    }

    public boolean isInside(Point2D.Double point)
    {
       boolean answer = false;
       double pointX= point.getX();
       double pointY= point.getY();
       answer=square.contains(pointX,pointY);
       return answer;
    }
    
    public void draw(Graphics2D g2, boolean filled )
    {
        
        g2.draw(square);
        if(filled==true)
        {
            g2.setColor(shapeColor);
            g2.fill(square);
        }
    }


}
