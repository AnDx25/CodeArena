/*
	Since number of zeroes in factorial of a number is because of multiplication of 2 and 5 .
	So counting numbe of 2s and 5s in a prime factor of number is sufficient
	Since number of 5 is always less than 2 so counting of 5 is sufficient
	So trailing zeroes in factorial of a number n= floor(n/5)+floor(n/25)+floor(n/125)....... so on until n/5^k=0;

TC: theta(log(n))
*/

import java.io.*;
import java.util.*;
public class EfficientApproach
{
	public static int countTrailingZeroes(int n)
	{
		int res=0;
		for(int i=5;i<=n;i=i*5)
		{
			res=res+(n/i);
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tZ=countTrailingZeroes(n);
		System.out.println("Number of Trailing in factorial "+n+" = "+tZ);

	}	
}







