class Animal
{
    public void sound()
    {
        System.out.println("Some sound");
    }
}

class Dog extends Animal        //overriding
{
    @Override
    public void sound()
    {
        System.out.println("Bark");
    }
}

class practice3
{
    public static void main(String A[])
    {
        Animal aobj = new Animal();
        Dog dobj = new Dog();

        aobj.sound();
        dobj.sound();
    }
}