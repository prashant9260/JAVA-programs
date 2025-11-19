class Demo
{
    public int i;
    //public fianl int j;       not allowed ERROR
    //public final int j = 21;  allowed
    public final int j;     // final characteristics/Users/marvellous/Desktop/PPA/java_programs/FinalDemo2.java

    Demo()  // Demo() : j(20)   -> C++
    {
        i = 10;
        j = 20;
    }
}

class FinalDemo2
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.i++;
        // dobj.j++;    Error
    }
}