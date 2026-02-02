import java.io.*;
import java.io.IOException;

public class Test11
{
    public static void main(String A[]) throws IOException
    {
        File dir1 = new File("C:\\Users\\Shree\\OneDrive\\Desktop\\Newfolder");
        boolean b1 = dir1.mkdir();  //create only newfolder
        System.out.println("Diretory created using mkdir():"+b1);

        //nested directories
        File dir2 = new File("C:\\Users\\Shree\\OneDrive\\Desktop\\LB\\childfolder");

        boolean b2 = dir2.mkdirs(); //creates parenats, child, subchild if they dont exist
        System.out.println("Nested directories created using mkdirs(): "+b2);
    }    
}