import java.io.*;

public class Test6
{
    public static void main(String A[]) throws IOException
    {
        FileWriter fw = new FileWriter("Ouput.txt");

        fw.write("Hello, world \n");
        fw.write("Thsi is character stream example");

        fw.close();
    }
}