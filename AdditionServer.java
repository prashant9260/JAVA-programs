import java.net.*;
import java.io.*;
import java.util.*;

class AdditionServer
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client request arrives and connected succesfully");
        DataInputStream diobj = new DataInputStream(sobj.getInputStream()); // ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); // mouth

    }
}