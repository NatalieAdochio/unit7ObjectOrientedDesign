import java.awt.Component;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javafx.scene.shape.Ellipse;
/**
Write a program that allows the user to specify a triangle with three mouse presses.
After the first mouse press, draw a small dot. After the second mouse press, draw a
line joining the first two points. After the third mouse press, draw the entire triangle.
The fourth mouse press erases the old triangle and starts a new one.
 */
public class Triangle
{
    /** description of instance variable x (add comment for each instance variable) */
    //     private int cordi1;
    //     private int cordi2;
    //     private int cordi2;

    private int clicks;

    private JFrame frame;
    /**
     * Default constructor for objects of class Triangle
     */
    public Triangle()
    {
        // initialise instance variables
        this.frame = new JFrame();
        //         
        //         cordi1 = 0;
        //         cordi2 = 0;
        //         cordi3 = 0;
        //         
        clicks = 0;

        MouseListener listener = new MouseListener();
    }

    public class MouseListener implements ActionListener
    {
        // put your code here
        public void actionPerformed(ActionEvent event)
        {
            double dotLocX = this.getX();
            double dotLocY = this.getY();
            Point2D elli = new Point2D();
            elli.setLocation(dotLocX, dotLocY);
            clicks++;
            if(clicks ==2)
            {
                Line2D line = new Line2D;
                line.setLine(elli, 
            }
        }
    }

}
