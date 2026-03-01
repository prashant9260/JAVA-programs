/*
ATM Withdrawal System – Problem Statement

A bank ATM must follow strict safety rules to prevent fraud and ensure that customers maintain a minimum balance.

When a customer inserts the card, they can check their balance and request a withdrawal.

The ATM must either:
- Approve the request and update the balance, OR
- Reject the request and display the correct reason.

Rules:

1. Withdrawal amount must be a multiple of 100.
2. Maximum withdrawal per transaction is 25,000.
3. After withdrawal, the account balance must remain at least 1,000.

Input:

Line 1: Current balance (integer)
Line 2: Requested withdrawal amount (integer)

Validations:

If balance < 0 or withdrawAmount <= 0 → Invalid Input

Expected Output:

If successful:
Transaction Successful.
Remaining Balance: <newBalance>

If failed:
Transaction Failed: <Reason>
*/

import java.util.*;

class ATMSystem
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Current_Balance = 0, withdraw_Amount = 0, New_Balance = 0;

        System.out.println("Enter Current balance : ");
        Current_Balance = sobj.nextInt();

        System.out.println("Enter withdraw amount : ");
        withdraw_Amount = sobj.nextInt();

        if(Current_Balance < 0 || withdraw_Amount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(withdraw_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdrawal amount must be a multiple of 100 ");
        }
        else if(withdraw_Amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum withdrawal per transaction is 25,000");
        }
        else if(Current_Balance - withdraw_Amount < 1000)
        {
            System.out.println("Transaction Failed : the account balance must remain at least 1,000 ");
        }
        else 
        {
            New_Balance = Current_Balance - withdraw_Amount;
            System.out.println("Transaction Successful.");
            System.out.println("Remaining balance : "+New_Balance);
        }

        sobj.close();
    }
}