import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI5
{
    public static void main(String A[])
    {
        //create A JFrame (window)
        JFrame frame = new JFrame("Simple swing app");

        //set the default close operation 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a JLabel
        JLabel label = new JLabel("Hello, swing!");

        //add the label to the frame
        frame.getContentPane().add(label);

        //set the size of the frame 
        frame.setSize(300,200);

        //mae the frame visible 
        frame.setVisible(true);

        
    }
}