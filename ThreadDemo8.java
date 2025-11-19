class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        try
        {
            for(i = 1 ; i < 10; i++)
            {
            System.out.println("Inside thread : "+Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception obj)
        {}
    }
}

class ThreadDemo7
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Inside main thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.setName("First");
        obj2.setName("Second");
        obj1.start();
        obj2.start();

        obj1.join();
        obj2.join();

        System.out.println("End of main thread");
    }
}