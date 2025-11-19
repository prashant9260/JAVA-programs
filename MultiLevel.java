class Base
{
    public int A, B;
    public Base()
    {
        System.out.println("Inside Base constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Fun of Base");
    }
}

class Derived extends Base  // class Derived : public Base
{
    public int X, Y;
    public Derived()
    {
        System.out.println("Inside Derived constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Gun of Derived");
    }
}

class DerivedX extends Derived
{
    public int L, M;
    public DerivedX()
    {
        System.out.println("Inside DerivedX constructor");
    }
    public void Sun()
    {
        System.out.println("Inside Sun of DerivedX");
    }
}

class MultiLevel
{
    public static void main(String A[])
    {
        System.out.println("Inside main");

        DerivedX dobj = new DerivedX();
        dobj.Fun();
        dobj.Gun();
        dobj.Sun();
    }
}