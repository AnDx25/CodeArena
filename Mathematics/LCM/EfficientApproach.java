/*
	To find LCM of two numbers a and b
	Since a*b=gcd(a,b)*lcm(a,b)
	So lcm(a,b)=a*b/gcd(a,b)

	TC: O(log(min(a,b)))
*/

import java.io.*;
import java.util.*;

public class EfficientApproach
{
	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);	
		}
	}
	public static int lcm(int a, int b)
	{
		return a*b/gcd(a,b);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(lcm(a,b));
	}
}
