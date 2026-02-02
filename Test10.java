import java.io.*;
import java.io.IOException;

public class Test10
{
    public static void main(String A[]) throws IOException
    {
        //Directory path
        File dir = new File("C:\\Users\\Shree\\OneDrive\\Desktop\\java_program");

        if(dir.exists() && dir.isDirectory())
        {
            System.out.println("Readable : "+ dir.canRead());
            System.out.println("Writable : "+ dir.canWrite());
            System.out.println("Executable : "+ dir.canExecute());

            boolean ro = dir.setReadOnly();

            System.out.println("Set to read-only : "+ro);

            System.out.println("Writable after read-only : "+dir.canWrite());        
        }
        else
        {
            System.out.println("File not found...");
        }
    }
}