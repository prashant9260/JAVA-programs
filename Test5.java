import java.io.*;

public class Test5
{
    public static void main(String A[]) throws IOException
    {
        FileReader fr = new FileReader("sample.txt");

        int i;
        while((i = fr.read()) != -1)
        {
            System.out.print((char)i);
        }

        fr.close();
    }
}