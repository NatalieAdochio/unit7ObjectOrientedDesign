import javax.swing.JPanel;
import java.awt.event.ActionEvent;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JPanel panel;

    private JButton pickColor;
    private JButton addCircle;
    private JButton addSquare;
    private JPanel colorDisplay;
    
    private DrawingPanel canvas;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        this.colorDisplay = new JPanel();

        this.canvas=canvas;
        this.canvas.getColor();
        
        this.add(pickColor);
        this.add(colorDisplay);
        this.add(addCircle);
        this.add(addSquare);
        
        ClickListener listenerColor = new ClickListener();
        this.pickColor.addActionListener(listenerColor);
        ClickListener listenerCircle = new ClickListener();
        this.addCircle.addActionListener(listenerCircle);
        ClickListener listenerSquare = new ClickListener();
        this.addSquare.addActionListener(listenerSquare);
    }

    public class ClickListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
            if(event.actionCommand() == "Pick Color")
            {
             this.canvas.pickColor();
             this.colorDisplay.setBackground(this.canvas.getColor());
            }
            else if(event.actionCommand()== "Add Circle")
            {
               this.canvas.addCircle(); 
            }
            else if(event.actionCommand()== "Add Square")
            {
                this.canvas.addSquare();
            }
        }
        
    }
    

}
