import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private JFrame frame;

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        // initialise instance variables
        
        this.setTitle("Drawing Editor");
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        
        this.setLayout( new BorderLayout());
        this.add(controls, BorderLayout.SOUTH);
        this.add(canvas, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(canvas.getPreferredSize());
    }

    
    public static void main()
    {
        // put your code here
        DrawingEditor drawE = new DrawingEditor();
        
        
        //this.setSize(FRAMEW,FRAMEH);
    }
    
}
