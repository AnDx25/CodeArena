import java.io.*;
import java.util.*;
/*
TC : theta(n)
*/
public class IterativeApproach
{	public static long factorial(long n)
	{
		long fact=1;
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		System.out.println("Factorial of "+ n + " is "+factorial(n));
		
	}
}
