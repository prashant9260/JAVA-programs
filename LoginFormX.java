import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin extends JFrame
{
    public MarvellousLogin(String Title, int Width, int Height)
    {
        setTitle(Title);
        setSize(Width,Height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class LoginFormX
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Marvellous Login",400,300);
    }
}