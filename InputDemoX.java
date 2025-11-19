import java.io.*;

class InputDemoX
{
    public static void main(String A[])
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter your name : ");
        String name = null;
        try
        {
            name = bobj.readLine();
        }
        catch(IOException obj)
        {
            System.out.println("Inside catch");
        }
        
        System.out.println("Welcome : "+name);
    }
}