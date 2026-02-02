import java.io.*;

public class Test9
{
    public static void main(String A[]) throws IOException
    {
        //Directory path
        File dir = new File("C:\\Users\\Shree\\OneDrive\\Desktop\\java_program");

        if(dir.exists() && dir.isDirectory())
        {
            System.out.println("Content of Directory : ");

            String[] names = dir.list();

            for(String name : names)
            {
                System.out.println("Name : "+name);
            }

            System.out.println("\n File objects using ListFiles(): ");
            
            File[] files = dir.listFiles();
            for(File f : files)
            {
                if(f.isFile())
                {
                    System.out.println(f.getName() + " : is a file");
                }
                else if(f.isDirectory())
                {
                    System.out.println(f.getName() + ": is a directory");
                }
                else
                {
                    System.out.println("There is no such directory...");
                }
            }
        }
    }
}