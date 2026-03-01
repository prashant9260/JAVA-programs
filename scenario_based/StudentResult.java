/*
3. Student Result Generation System

A university wants to generate student results automatically.

Each student has marks in five subjects, each out of 100.

The result should clearly show whether the student failed in any subject and, if passed, the final classification based on average marks.

Rules:

• If marks in any subject < 35 → Student is Fail

• If student passes all subjects, calculate average and classify:

    Average ≥ 75 → Distinction
    Average ≥ 60 → First Class
    Average ≥ 50 → Second Class
    Average < 50 → Pass

Input:

• Five integers (marks in 5 subjects)

Validations:

• Each mark must be between 0 and 100

Expected Output:

If fail:
Result: Fail

Else:
Average Marks: <avg>
Final Result: <classification>
*/

import java.util.*;

class StudentResult
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks[] = new int[5];
        int i = 0;
        int iSum = 0;

        boolean Pass = true;
        boolean Invalid = false;

        System.out.println("Enter marks: ");
        for(i = 0; i < Marks.length; i++)
        {
            Marks[i] = sobj.nextInt();

            if(Marks[i] < 35)
            {
                Pass = false;
            }

            if(Marks[i] < 0 || Marks[i] > 100)
            {
                Invalid = true;
            }

            iSum = iSum + Marks[i];
        }

        if(Invalid == true)
        {
            System.out.println("Invalid marks");
            return;
        }

        if(Pass == false)
        {
            System.out.println("Result : Fail");
            return;
        }

        float Average = (float) iSum / (float) 5;

        System.out.println("Average Marks : "+Average);

        if(Average >= 75.0f)
        {
            System.out.println("Final Result: Distinction");
        }
        else if(Average >= 60.0f)
        {
            System.out.println("Final Result: First Class");
        }
        else if(Average >= 50)
        {
            System.out.println("Final Result: Secound Class");
        }
        else if(Average < 50)
        {
            System.out.println("Final Result: Pass");
        }
    }
}