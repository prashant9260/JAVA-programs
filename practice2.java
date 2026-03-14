
class practice2
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)            //overloading
    {
        return a + b + c;
    }

    public static void main(String A[])
    {
        practice2 pobj = new practice2();

        System.out.println(pobj.add(10,23));
        System.out.println(pobj.add(10,20,30));
    }
}