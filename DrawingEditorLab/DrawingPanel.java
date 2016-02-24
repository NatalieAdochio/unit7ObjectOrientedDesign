import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JColorChooser;
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
    private ArrayList<Shape> shape;  
    private boolean currPick;
    public DrawingPanel()
    {
        this.drawingColor= Color.BLUE;
        this.setBackground(Color.WHITE);

        MouseListener listen = new MousePressListener();
        this.addMouseListener(listen);

        this.shape = new  ArrayList<Shape>();
    }
    class MousePressListener implements MouseListener, MouseMotionListener
    {

    }
    public Color getColor()
    {
        return drawingColor;
    }

    public Dimension getPreferredSize()
    {

    }

    public void pickColor()
    {
        Color newColor = choose.showDialog(this, "Pick a Color", this.getColor());
    }
}
