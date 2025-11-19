class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        for(i = 1 ; i < 10; i++)
        {
           System.out.println("Inside thread : "+Thread.currentThread().getName()+" : "+i);
        }
    }
}

class ThreadDemo5
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.setName("First");
        obj2.setName("Second");
        obj1.start();
        obj2.start();
        System.out.println("End of main thread");
    }
}