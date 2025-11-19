import java.util.*;

class Input
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no1 = 0, no2 = 0, ans = 0;

        System.out.println("Enter first number : ");
        no1 = sobj.nextInt();
        
        System.out.println("Enter second number : ");
        no2 = sobj.nextInt();
        
        ans = no1 + no2;

        System.out.println("Addition is : "+ans);
    }
}

/*
        Premitive Data types            Method (Scanner class)

            boolean                         nextBoolean()
            byte                            nextByte()
            char                            --
            short                           nextShort()
            int                             nextInt()
            float                           nextFloat()
            double                          nextDouble()
            long                            nextLong()

*/