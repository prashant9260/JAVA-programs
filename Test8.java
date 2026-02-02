import java.io.*;

public class Test8
{
    public static void main(String A[]) throws IOException
    {
        File fobj = new File("Sample.txt");

        System.out.println(fobj.exists());  //false if file not present
        System.out.println(fobj.getName()); //SampleX.txt 
    }
}