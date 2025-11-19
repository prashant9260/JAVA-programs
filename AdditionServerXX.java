import java.net.*;
import java.io.*;
import java.util.*;

class AdditionServerXX
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client request arrives and connected succesfully");
        DataInputStream diobj = new DataInputStream(sobj.getInputStream()); // ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); // mouth





        int Value1 = 0, Value2 = 0, Sum = 0;

        Value1 = diobj.readInt();
        Value2 = diobj.readInt();
        Sum = Value1 + Value2;
        doobj.writeInt(Sum);


        System.out.println("End of server application");
    }
}