import java.io.*;
import java.net.*;

class ChatServerX
{
    public static void main(String Arg[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Marvellous server is waiting at port number 5100");
        
        Socket sobj = ssobj.accept();
        System.out.println("Marvellous Server suucesfully connected with the client");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----------------------------------------------------");
        System.out.println("Marvellous Chat messanger is ready to use");
        System.out.println("----------------------------------------------------");
   
        String str1 = null, str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            System.out.println("Enter the message for client : ");
            str2 = bobj2.readLine();
            pobj.println(str2);
        }
    }
}