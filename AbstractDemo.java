import java.util.Scanner;

abstract class RBI
{
    public String Country = "India";

    public void DisplayKYC()
    {
        System.out.println("Please submit your Address proof and photo id");
    }

    abstract public void DisplayROI();
}

class SBI extends RBI
{
    public void DisplayROI()
    {
        System.out.println("Our ROI for FD is 7.5%");
    }
}

class BOM extends RBI
{
      public void DisplayROI()
    {
        System.out.println("Our ROI for FD is 8.5%");
    }  
}

class AbstractDemo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        RBI robj = null;

        System.out.println("Please select your bank : ");
        System.out.println("1 : State Bank of India");
        System.out.println("2 : Bank of Maharashtra");
        int Option = sobj.nextInt();

        if(Option == 1)
        {
            robj = new SBI();       // Upcasting
        }
        else if(Option == 2)
        {
            robj = new BOM();       // Upcasting
        }
        
        System.out.println("Country is : "+robj.Country);
        robj.DisplayKYC();
        robj.DisplayROI();
    }
}