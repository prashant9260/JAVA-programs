import java.util.Scanner;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {   super(str); }
}

class ExceptionDemo4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sobj.nextInt();
        try
        {
            if(age < 18)
            {
                AgeInvalid aobj = new AgeInvalid("MARVELLOUS CLASS");
                throw aobj;
            }
        }
        catch(AgeInvalid obj)
        {
            System.out.println("Inside catch "+obj);
        }
    }
}