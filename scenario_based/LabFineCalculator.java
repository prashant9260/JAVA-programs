/*
1. In your college library, students borrow books for exams and assignments.

   The librarian wants an automatic fine calculator so that staff don't
   need to calculate fines manually for every student.

2. Policy:
   - A student can keep a borrowed book for up to 7 days without any penalty.

3. Fine Rules:
   - If the book is returned within 7 days:
       No fine.

   - If total days are 8 to 12:
       ₹5 per day for each day beyond 7.

   - If total days are more than 12:
       ₹5 per day for days 8–12.
       ₹10 per day for each day beyond 12.

4. Input:
   - One integer: total number of days the book was kept (daysKept).

5. Validation:
   - If daysKept < 0 → Invalid input.

6. Expected Output:
   - If daysKept <= 7:
       "Returned on time. No fine applicable."

   - Else:
       "Total fine to be paid: <fineAmount>"
*/

import java.util.*;

class LabFineCalculator
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int daysKept = 0, Fine = 0;

        System.out.println("Enter the number of days :  ");
        
        daysKept = sobj.nextInt();

        if(TotalDays < 0)
        {
            System.out.println("Invalid input...");
            return;
        }

        if(TotalDays <= 7)
        {
            System.out.println("No fine applicable");
            return;
        }
        else if((TotalDays >= 8) && (TotalDays <= 12))
        {
            Fine = (TotalDays - 7) * 5;
        }
        else if(TotalDays > 12)
        {
            Fine = (5 * 5) + (TotalDays - 12) * 10;
        }

        System.out.println("Total fine to be paid: "+Fine);

        sobj.close();
    }
}