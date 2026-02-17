import java.io.*;

class Test13
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name : ");
        String name = br.readLine();
        System.out.println(name);
    }
}
