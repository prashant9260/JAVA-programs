class Base
{
    public void Fun()
    {   System.out.println("Base Fun"); }
    public void Gun()
    {   System.out.println("Base Gun"); }
    public void Sun()
    {   System.out.println("Base Sun"); }
}

class Derived extends Base
{
    public void Fun()
    {   System.out.println("Derived Fun"); }
    public void Run()
    {   System.out.println("Derived Run"); }
}

class MethodOverriding
{
    public static void main(String A[])
    {
        //Base bobj1 = new Base();            // No casting
        //Derived dobj1 = new Derived();      // No casting
        // Derived dobj2 = new Base();         // Down casting  NOT ALLOWED Error        
        
        Base bobj2 = new Derived();         // Up casting for overriding

        bobj2.Fun();        // Derived Fun
        bobj2.Gun();        // Base Gun
        bobj2.Sun();        // Base Sun
        // bobj2.Run();        // Error
        
    }
}