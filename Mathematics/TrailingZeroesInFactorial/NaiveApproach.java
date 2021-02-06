import java.io.*;
import java.util.*;
/*
	Find factorial of number and then keep on dividing the factorial until it is divisible by 10;
	
	TimeComplexity : theta(n)

Limitation : Since factorial for number more than 10 becomes so large that it get overflow so then this approach wouldn't work to get the trailing zeroes.
*/
public class NaiveApproach
{	
	public static long factorial(long n)
	{
		long fact=1;
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}	
	
	public static int trailingZeroes(long factorial)
	{
		int count=0;
		//Keep on dividing the factorial until it is divisible by 10;
		while(factorial%10==0)
		{
			++count;
			factorial=factorial/10;
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//1. Find factorial of a number
		long fact=factorial(n);
		//2. FInd number of zeroes at end in that factorial
		int tZ=trailingZeroes(fact);
		System.out.println(tZ);
	}
}
