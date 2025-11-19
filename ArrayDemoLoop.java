class ArrayDemoLoop
{
    public static void main(String A[])
    {
        int i = 0;

        int Arr[] = {10,20,30,40};

        System.out.println("For loop");
        
        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

        i = 0;
        System.out.println("While loop");
        while(i < Arr.length)
        {
            System.out.println(Arr[i]);
            i++;
        }

        i = 0;
        System.out.println("do-While loop");
        do
        {
            System.out.println(Arr[i]);
            i++;
        }while(i < Arr.length);
       
    }
}