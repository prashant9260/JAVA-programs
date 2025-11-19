import java.util.Scanner;

class Arithematic
{
    public float Division(int no1, int no2) throws ArithmeticException
    {
        float ans = no1 / no2;
        return ans;
    }
}

class ExceptionDemo3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int value1 = sobj.nextInt();
        System.out.println("Enter second number : ");
        int value2 = sobj.nextInt();
        
        Arithematic aobj = new Arithematic();
        float ret = 0.0f;

        try
        {
            ret = aobj.Division(value1,value2);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch");
        }
        
        System.out.println("Division is : "+ret);
    }
}