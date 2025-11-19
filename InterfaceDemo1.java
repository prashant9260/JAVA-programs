import java.io.*;

interface Circle
{
    float PI = 3.14f;

    float CalculateArea(float Radius);
    float CalculateCircumfarnce(float Radius);
}

class Marvellous implements Circle
{
    public float CalculateArea(float Radius)
    {
        float Area = 0.0f;
        Area = PI * Radius * Radius;
        return Area;   
    }

    public float CalculateCircumfarnce(float Radius)
    {
        float Circumfarance = 0.0f;
        Circumfarance = 2 * PI * Radius;
        return Circumfarance;
    }

    public void Display()
    {
        System.out.println("Inside Display of Marvellous");
    }
}

class InterfaceDemo1
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Value of PI : "+Circle.PI);
        // Circle.PI = 7.10f;   Error due to final

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        Marvellous mobj = new Marvellous();

        System.out.println("Enter radius : ");
        float Rad = Float.parseFloat(bobj.readLine());

        System.out.println("Area is : "+mobj.CalculateArea(Rad));
        System.out.println("Circumfarnce is : "+mobj.CalculateCircumfarnce(Rad));
        mobj.Display();
    }
}