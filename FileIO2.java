import java.io.*;

class FileIO2
{
    public static void main(String A[])
    {
        try
        {
            FileWriter fwobj = new FileWriter("MarvellousX.txt");
            fwobj.write("Pre-Placement Activity batch 53");
            fwobj.write("Logic building with Industrial project development");
            fwobj.close();
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+obj);
        }
    }
}
