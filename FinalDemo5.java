final class Demo
{
    public int i = 11;
    public void fun()
    {   System.out.println("Inside Demo fun");  }
}

class Hello 
{  
    public Demo dobj;
    public int j = 21;
    Hello()
    {
        dobj = new Demo();
    }
}

class FinalDemo5
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();

        System.out.println(hobj.j);     // 21
        System.out.println(hobj.dobj.i);     // 11
        hobj.dobj.fun();
        
    }
}