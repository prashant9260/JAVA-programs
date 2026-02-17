//ADDING MANAGERS

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

 
public class GUI7 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adding Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel label = new JLabel("Click the button!");
        JButton button = new JButton("Click me");
 
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
 
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}