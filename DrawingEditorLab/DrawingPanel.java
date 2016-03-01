import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import java.awt.Dimension;
import javax.swing.JComponent;
import java.awt.Graphics;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    private JPanel panel;
    private Color drawingColor;
    private ArrayList<Shape> shapes;  
    private boolean currPick;
    private int width= 900;
    private  int height=900;
    public DrawingPanel()
    {
        this.drawingColor= Color.BLUE;
        this.setBackground(Color.WHITE);

        //MouseListener listen = new MousePressListener();
        //this.addMouseListener(listen);

        this.shapes = new  ArrayList<Shape>();
    }
//     class MousePressListener implements MouseListener, MouseMotionListener
//     {
// 
//     }
    public Color getColor()
    {
        return drawingColor;
    }

    public Dimension getPreferredSize()
    {
        Dimension dim = new Dimension(); 
        dim.setSize(width,height);
        return dim;
    }

    public void pickColor()
    {
        Color newColor = JColorChooser.showDialog(this, "Pick a Color", this.getColor());
    }
    
    public void addCircle()
    {
       Circle circle = new Circle(23.0, drawingColor, width/2,height/2);
       shapes.add(circle);
       currPick = true;
       repaint();
    }
//     public void addSquare()
//     {
//         Square square = new Square(23.0, drawingColor, width/2,height/2);
//        shapes.add(square);
//        currPick = true;
//        repaint();
//     }
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       for(int i= shapes.size()-1; i>=0;i--)
       {
           
        }
    }
}
