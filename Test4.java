import java.io.*;

public class Test4
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name : ");

        String name = br.readLine();    //reads entire line 
        System.out.println("Hello "+name);
    }
}