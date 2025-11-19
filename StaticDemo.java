class Demo
{
    public int i,j;         // Instance variables
    public static int k;    // Class variable

    static
    {
        System.out.println("Inside static block");
        k = 51;
    }
    public Demo()
    {
        System.out.println("Inside constructor");
        i = 11; j = 21;
    }
    public void fun()   // Instance method
    {
        System.out.println("Inside fun");
        System.out.println(i+" "+" "+j+" "+k);
    }
    public static void gun() // Class method
    {
        System.out.println("Inside gun");
        System.out.println(k);
    }
}

class StaticDemo
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        System.out.println(Demo.k);
        Demo.gun();

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        
        System.out.println(obj1.i+" "+obj1.j);
        obj1.fun();
    }
}