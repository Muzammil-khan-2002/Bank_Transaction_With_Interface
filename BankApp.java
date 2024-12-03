import java.util.*;
class Bank //Parent class
{
	static int p,t,r;
	static	float emi;
	
	public static float getMonthlyEmiUsingSimpleInterest(int loan_amount,int duration)
	{	//	SI=(P * T * R)/100;
		p=loan_amount;
		t=duration;
		r=9;
		// EMI = (P X R/12) X [(1+R/12) ^N] / [(1+R/12) ^N-1].
		int month=(1+r/12);
		int t1=t-1;
		emi= (p*r/12) * (float)(Math.pow(month,t)) /  (float)(Math.pow(month,t1));
		
		return emi;
	}
}

class Cooperative extends Bank // child class of bank class
{
	static int p,t,r;
	static	float emi;
	
	public static float getMonthlyEmiUsingSimpleInterest(int loan_amount,int duration)
	{	//	SI=(P * T * R)/100;
		p=loan_amount;
		t=duration;
		r=10;
		// EMI = (P X R/12) X [(1+R/12) ^N] / [(1+R/12) ^N-1].

		int month=(1+r/12);
		int t1=t-1;
		emi= (p*r/12) * (float)(Math.pow(month,t)) /  (float)(Math.pow(month,t1));
		
		return emi;
	}
}

class Nationalize extends Bank // child class of bank class
{
		static int p,t,r;
		static float emi;
	
	public static float getMonthlyEmiUsingSimpleInterest(int loan_amount,int duration)
	{	//	SI=(P * T * R)/100;
		p=loan_amount;
		t=duration;
		r=7;
		// EMI = (P X R/12) X [(1+R/12) ^N] / [(1+R/12) ^N-1].

		int month=(1+r/12);
		int t1=t-1;
		emi= (p*r/12) * (float)(Math.pow(month,t)) /  (float)(Math.pow(month,t1));
		
		return emi;
	}
}

public class BankApp
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("1- Bank.");
		System.out.println("2- Cooperative.");
		System.out.println("3- Nationalize.");
		System.out.println("0-Terminate The Program.");
		System.out.println("Enter Choice");
		int ch=xyz.nextInt();
		System.out.println("\n-------------------------------------------------");
						System.out.println("Enter Loan Amount?\t");
						int p=xyz.nextInt();
						System.out.println("Enter Duration?\t");
						int t=xyz.nextInt();
		Bank b = null;
		switch(ch)
		{
			case 1:						
						b=new Bank();
					break;
			case 2:
						b=new Cooperative();
					break;
			case 3:
						b=new Nationalize();
					break;
			default :
						{
							System.out.println("Invalid Input!");
						}
						break;
		}
		
		if(b!=null){
			float result=b.getMonthlyEmiUsingSimpleInterest(p,t);
						System.out.println("Bank : "+result);
		}
						
						System.out.println("\n-------------------------------------------------");
					
		
	}
}