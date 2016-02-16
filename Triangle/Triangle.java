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
    private static final int FRAMEW=100;
    private static final int FRAMEH = 100;
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

        
        MouseListener listener = new MousePressListener();

        this.frame.setSize(FRAMEW,FRAMEH);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public class MousePressListener implements MouseListener
    {
        // put your code here
        public void mouseClicked(MouseEvent event)
        {
            double dotLocX = this.getX();
            double dotLocY = this.getY();
            //Point2D second = new Point2D();
            //second.setLocation(dotLocX, dotLocY);
            clicks++;
            if (clicks ==1)
            {
                Point2D elli = new Point2D();
                elli.setLocation(dotLocX, dotLocY);
            }
            else if(clicks ==2)
            {
                Line2D secondLine = new Line2D();
                Point2D second = new Point2D();
                second.setLocation(dotLocX, dotLocY);
                secondLine.setLine(elli, second); 
                Graphics2D g2 = (Graphics2D) g;
                g2.draw(SecondLine);
            }
            else if(clicks ==3)
            {
                Line2D thirdLine = new Line2D();
                Point2D third = new Point2D();
                third.setLocation(dotLocX, dotLocY);
                thirdLine.setLine(elli, third);
                Graphics2D g4 = (Graphics2D) g;
                g4.draw(thirdLine);

                Line2D lastLine = new Line2D();
                LastLine.setLine(third, second);
                Graphics2D g3 = (Graphics2D) g;
                g3.draw(LastLine);
            }
            else if(clicks ==4)
            {
                clicks = 0;
                repaint();
            }
        }

        public void mouseReleased(MouseEvent event)
        {

        }  

        public void mouseEntered(MouseEvent event)
        {

        }

        public void mouseExited(MouseEvent event)
        {

        }
        public void mousePressed(MouseEvent event)
            {
                
            }
    }
}


