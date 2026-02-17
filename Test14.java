import java.io.*;

class Test14
{
    public static void main(String[] args) throws Exception
    {
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Enter the name : ");
        String str = din.readLine();
        System.out.println(str);
    }
}
