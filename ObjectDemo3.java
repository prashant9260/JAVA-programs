class Student
{
    public String Name;
    public int Rno;
    public int Marks;
    
    public Student(String str, int A, int B)
    {
        System.out.println("Inside constructor");
        this.Name = str;
        this.Rno = A;
        this.Marks = B;
    }

    // sobj1.equals(sobj2)

    public boolean equals(Student obj)
    {
        System.out.println("this.Name "+this.Name);
        System.out.println("obj.Name "+obj.Name);
        
        return true;
    }
}

class ObjectDemo3
{
    public static void main(String A[])
    {
        Student sobj1 = new Student("Sagar", 11, 89);
        Student sobj2 = new Student("Pooja", 11, 89);

        System.out.println(sobj1.equals(sobj2));
    }
}