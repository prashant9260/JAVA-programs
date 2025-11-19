interface Demo
{
    void Fun();
}

interface Hello extends Demo
{
    void Gun();
}

class Marvellous implements Hello
{
    public void Fun()
    {
        System.out.println("Inside Fun");
    }
    public void Gun()
    {
        System.out.println("Inside Gun");
    }
}

class InterfaceDemo3
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        mobj.Fun();
        mobj.Gun();
    }
}