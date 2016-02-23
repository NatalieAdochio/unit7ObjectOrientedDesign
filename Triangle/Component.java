//import java.awt.Component;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javafx.scene.shape.Ellipse;
import java.awt.Point;
/**
 * Write a description of class Component here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Component extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    public Component()
    {
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;
        int x3=0;
        int y3=0;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(SecondLine);

        Graphics2D g4 = (Graphics2D) g;
        g4.draw(thirdLine);

        Graphics2D g3 = (Graphics2D) g;
        g3.draw(LastLine);  
    }

    //     public void code(int clicks, MouseEvent event)
    //     {
    //         // put your code here
    //         clicks++;
    //         if (clicks ==1)
    //         {
    //             Point elli = new Point(event.getX(),event.getY());
    // 
    //         }
    //         else if(clicks ==2)
    //         {
    //             //Line2D secondLine = new Line2D();
    //             Point second = new Point(event.getX(),event.getY());
    // 
    //             secondLine.setLine(elli, second); 
    //             Graphics2D g2 = (Graphics2D) g;
    //             g2.draw(SecondLine);
    //         }
    //         else if(clicks ==3)
    //         {
    //             Line2D thirdLine = new Line2D();
    //             Point third = new Point(event.getX(),event.getY());
    // 
    //             thirdLine.setLine(elli, third);
    //             Graphics2D g4 = (Graphics2D) g;
    //             g4.draw(thirdLine);
    // 
    //             Line2D lastLine = new Line2D();
    //             LastLine.setLine(third, second);
    //             Graphics2D g3 = (Graphics2D) g;
    //             g3.draw(LastLine);
    //         }
    //         else if(clicks ==4)
    //         {
    //             clicks = 0;
    //             repaint();
    //         }
    //     }

}
