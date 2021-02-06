import java.io.*;
import java.util.*;
/*
T(n)=T(n-1)+c
T(n)=c+c+c+c+c....n=>nc
TC : theta(n)
*/
public class RecursiveApproach
{	public static long factorial(long n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		System.out.println("Factorial of "+ n + " is "+factorial(n));
		
	}
}
