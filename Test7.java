import java.io.*;

public class Test7
{
    public static void main(String A[]) throws IOException
    {
       BufferedWriter bw = new BufferedWriter(new FileWriter("Output2.txt"));

       bw.write("Hello, Bufferedwriter!");
       bw.newLine();
       bw.write("Another line here.");
       
       bw.close();
    }
}