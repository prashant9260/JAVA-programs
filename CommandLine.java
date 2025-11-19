class CommandLine
{
    public static void main(String A[])
    {
        System.out.println("Demonstration of command line arguments");

        int Arr[] = {10,20,30,40};
        System.out.println("Size of Arr is : "+Arr.length);

        System.out.println("Number of command line areguments are : "+A.length);
    
        System.out.println("First : "+A[0]);
        System.out.println("Second : "+A[1]);
    }
}