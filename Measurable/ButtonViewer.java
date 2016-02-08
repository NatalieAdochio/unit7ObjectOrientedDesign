
  import javax.swing.JFrame;
    import javax.swing.JButton;
    import java.awt.event.ActionListener;
public class ButtonViewer
{
   private static final int FRAMEW=100;
   private static final int FRAMEH = 60;
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       JButton button = new JButton("click me");
       frame.add(button);
       
       ClickListener listener = new ClickListener();
       button.addActionListener(listener);
       
       frame.setSize(FRAMEW,FRAMEH);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
}
