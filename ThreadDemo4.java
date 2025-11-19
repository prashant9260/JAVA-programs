class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside thread : "+Thread.currentThread().getName());
    }
}

class ThreadDemo4
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
    }
}