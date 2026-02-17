import java.io.*;

class Test17
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fout =
            new FileOutputStream("Demo.txt");

        BufferedOutputStream bout =
            new BufferedOutputStream(fout);

        String str = "Buffered Output Stream";

        bout.write(str.getBytes());

        bout.flush();   // important
        bout.close();

        System.out.println("Data written successfully");
    }
}
