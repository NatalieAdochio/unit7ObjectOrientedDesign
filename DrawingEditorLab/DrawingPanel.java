import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import java.awt.Dimension;
import javax.swing.JComponent;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.Graphics2D;
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
    private int width= 600;
    private Shape activeShape;
    private  int height=600;
    public DrawingPanel()
    {
        this.drawingColor= Color.BLUE;
        this.setBackground(Color.WHITE);

        MousePressListener listen = new MousePressListener();
        this.addMouseListener(listen);

        this.shapes = new  ArrayList<Shape>();
    }
    class MousePressListener implements MouseListener, MouseMotionListener

    {
        public void mouseClicked(MouseEvent event)
        {}

        public void mouseEntered(MouseEvent event)
        {}

        public void mouseExited(MouseEvent event)
        {}

        public void mousePressed(MouseEvent event)
        {
            
            for ( int i = shapes.size()-1; i>=0;i--)
            {
                if(shapes.get(i).isInside(new Point2D.Double(event.getX(),event.getY()))== true)
                {
                    currPick=true;
                    activeShape=shapes.get(i);
                    repaint();
                    break;
                }
            }
            currPick=false;
        }
        //Get the activeShape
        //Get the position of the mouse
        //Make a new Shape, with radius of oldshape.getRadius() and x and y are mouse location
        //  Replace the old shape in the arraylist with the new shape
        //call repaint()
        public void mouseDragged(MouseEvent event)
        {}

        public void mouseMoved(MouseEvent event)
        {}

        public void mouseReleased(MouseEvent event)
        {
            if (activeShape != null)
            {
                Shape current = activeShape;
                double x = event.getX();
                double y = event.getY();
                Shape newShape;
                if (current instanceof Circle)
                {
                    newShape = new Circle(current.getRadius(), current.shapeColor, x, y);
                } 
                else
                {
                    newShape = new Square(current.getRadius(), current.shapeColor, x, y);
                }
                int i = shapes.indexOf((Shape) activeShape);
                shapes.set(i, newShape);
                repaint();
            }
        }
    }
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
        drawingColor=newColor;
    }

    public void addCircle()
    {
        Circle circle = new Circle(23.0, drawingColor, width/2,height/2);
        shapes.add(circle);
        currPick = true;
        repaint();
    }

    public void addSquare()
    {
        Square square = new Square(23.0, drawingColor, width/2,height/2);
        shapes.add(square);
        currPick = true;
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(int i= shapes.size()-1; i>=0;i--)
        {
            if (shapes.get(i).equals(activeShape))
            {
                shapes.get(i).draw(g2,false);
            }
            else
            {
                shapes.get(i).draw(g2,true);
            }
        }
    }
}
