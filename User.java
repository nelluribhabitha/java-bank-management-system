



//BANK QUESTION//

import java.util.*;
interface RBI
{
    Scanner sc=new Scanner(System.in);
    double withdraw(double amount);
    double deposit(double amount);
    void loan();
    void balanceEnquiry();
}
class SBI implements RBI
{
    double balance=10000;
    public double withdraw(double amount)
    {
       if(amount > 0 && balance >= amount)
        {
            balance=balance-amount;
            System.out.println("Transaction successfull withdrawn amount : "+amount);
        }
        else
        {
            System.out.println("Insufficient funds");
        }
            return balance;
    }

    public double deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount deposited successfully inr : "+amount);
        }
        else
        {
            System.out.println("Invalid deposit amount ");
        }
            return balance;
    }
    public void balanceEnquiry()
    {
        System.out.println("Current Balance : "+balance);
    }
    public void loan()
    {
        System.out.print("Enter cibil score to check Eligibility : ");
        int cibil=sc.nextInt();
        if(cibil>=600 && cibil<=900)
        {
            double loan_amount=0;
            if(cibil>=600 && cibil<=700)
                loan_amount=200000;
            else if(cibil>700&& cibil <=800)
                loan_amount=500000;
            else
                loan_amount=1000000;
            while(true){
                System.out.println("You are eligible for loan amount : "+loan_amount);
                System.out.print("Enter your required amount : ");
                double l=sc.nextDouble();
                if(l > 0 && l <= loan_amount)
                {
                    loan_amount=l;
                    break;
                }
                else
                {
                    System.out.println("You are not eligible for that amount choose below your approval limit ");
                }
            }
            System.out.println("1 - for 1 year rate of interest 10%");
            System.out.println("2 - for 2 year rate of interest 15%");
            System.out.println("3 - for 3 year rate of interest 18%");
            System.out.print("Enter your tenure : ");
            int tenure=sc.nextInt();
            if(tenure>=1 && tenure<=3)
            {
                double interest=0;
               if(tenure==1)
               {
                   interest=loan_amount*0.10;
                   System.out.printf("Your loan amount : %.2f%nInterest : %.2f%nTotal payable amount : %.2f%nPer month EMI : %.2f%n",loan_amount,interest,(loan_amount+interest),((loan_amount+interest)/12));
               }
               else if(tenure==2)
               {
                    interest=loan_amount*0.15;
                   System.out.printf("Your loan amount : %.2f%nInterest : %.2f%nTotal payable amount : %.2f%nPer month EMI : %.2f%n",loan_amount,interest,(loan_amount+interest),((loan_amount+interest)/24));
               }
               else
               {
                    interest=loan_amount*0.18;
                   System.out.printf("Your loan amount : %.2f%nInterest : %.2f%nTotal payable amount : %.2f%nPer month EMI : %.2f%n",loan_amount,interest,(loan_amount+interest),((loan_amount+interest)/36));
               }
            }
            else
                System.out.println("Invalid tenure ");
        }
        else
        {
            System.out.println("You are not Eligible for any loan :(");
        }
    }
    void transaction()
    {
        System.out.println("1 - Deposit\n2 - withdraw\n3 - Check Balance\n4 - Loan");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.print("Enter deposit amount : ");
            System.out.println("Available balance : "+deposit(sc.nextDouble()));
        }
        else if(n==2)
        {
            System.out.print("Enter withdraw amount : ");
            System.out.println("Available balance : "+withdraw(sc.nextDouble()));
        }
        else if(n==3)
        {
            balanceEnquiry();
        }
        else if(n==4)
        {
            loan();
        }
        else
        {
            System.out.println("Invalid choice ");
        }
        System.out.print("Press 1 to do another transaction or any key to exit : ");
        char ch=sc.next().charAt(0);
        if(ch=='1')
            transaction();
        else
            System.out.println("Thank you :)");
    }
}
class KOTAK implements RBI
{
    double balance=10000;
    public double withdraw(double amount)
    {
                
        if(amount > 0 && balance >= amount)
        {
            balance=balance-amount;
            System.out.println("Transaction successfull withdrawn amount : "+amount);
        }
        else
        {
            System.out.println("Insufficient funds");
        }
            return balance;
    }
    public double deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount deposited successfully inr : "+amount);
        }
        else
        {
            System.out.println("Invalid deposit amount ");
        }
            return balance;
    }
    public void balanceEnquiry()
    {
        System.out.println("Current Balance : "+balance);
    }
    public void loan()
    {
        System.out.print("Enter cibil score to check Eligibility : ");
        int cibil=sc.nextInt();
        if(cibil>=600 && cibil<=900)
        {
            double loan_amount=0;
            if(cibil>=600 && cibil<=700)
                loan_amount=500000;
            else if(cibil>700&& cibil <=800)
                loan_amount=700000;
            else
                loan_amount=1500000;
            while(true){
                System.out.println("You are eligible for loan amount : "+loan_amount);
                System.out.print("Enter your required amount : ");
                double l=sc.nextDouble();
                if(l > 0 && l <= loan_amount)
                {
                    loan_amount=l;
                    break;
                }
                else
                {
                    System.out.println("You are not eligible for that amount choose below your approval limit ");
                }
            }
            System.out.println("1 - for 1 year rate of interest 12%");
            System.out.println("2 - for 2 year rate of interest 20%");
            System.out.println("3 - for 3 year rate of interest 22%");
            System.out.print("Enter your tenure : ");
            int tenure=sc.nextInt();
            if(tenure>=1 && tenure<=3)
            {
                double interest=0;
               if(tenure==1)
               {
                   interest=loan_amount*0.12;
                   System.out.printf("Your loan amount : %.2f%nInterest : %.2f%nTotal payable amount : %.2f%nPer month EMI : %.2f%n",loan_amount,interest,(loan_amount+interest),((loan_amount+interest)/12));
               }
               else if(tenure==2)
               {
                    interest=loan_amount*0.20;
                   System.out.printf("Your loan amount : %.2f%nInterest : %.2f%nTotal payable amount : %.2f%nPer month EMI : %.2f%n",loan_amount,interest,(loan_amount+interest),((loan_amount+interest)/24));
               }
               else
               {
                    interest=loan_amount*0.22;
                   System.out.printf("Your loan amount : %.2f%nInterest : %.2f%nTotal payable amount : %.2f%nPer month EMI : %.2f%n",loan_amount,interest,(loan_amount+interest),((loan_amount+interest)/36));
               }
            }
            else
                System.out.println("Invalid tenure ");
        }
        else
        {
            System.out.println("You are not Eligible for any loan :(");
        }
    }
    void transaction()
    {
        System.out.println("1 - Deposit\n2 - withdraw\n3 - Check Balance\n4 - Loan");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.print("Enter deposit amount : ");
            System.out.println("Available balance : "+deposit(sc.nextDouble()));
        }
        else if(n==2)
        {
            System.out.print("Enter withdraw amount : ");
            System.out.println("Available balance : "+withdraw(sc.nextDouble()));
        }
        else if(n==3)
        {
            balanceEnquiry();
        }
        else if(n==4)
        {
            loan();
        }
        else
        {
            System.out.println("Invalid choice ");
        }
        System.out.print("Press 1 to do another transaction or any key to exit : ");
        char ch=sc.next().charAt(0);
        if(ch=='1')
            transaction();
        else
            System.out.println("Thank you :)");
    }
}
public class User
{
	public static void main(String[] args) {
        
    System.out.println("=================================");
    System.out.println("     BANK MANAGEMENT SYSTEM");
    System.out.println("=================================");
    System.out.println("1 - SBI");
    System.out.println("2 - KOTAK");
		
		int n=RBI.sc.nextInt();
		if(n==1)
		{
             System.out.println("\nWelcome to SBI");
		    new SBI().transaction();
		}
		else if(n==2)
		{
             System.out.println("\nWelcome to KOTAK");
		    new KOTAK().transaction();
		}
		else
		{
		    System.out.println("Invalid try again ");
		    main(args);
		}
	}
}





