/*
	Here Idea is that always reduce the bigger number by taking out remainder out of division of bigger and smaller number until the remainder gets zero
	TC : O(log(min(a,b)))
*/

import java.io.*;
import java.util.*;

public class EuclideanOptimisedApproach
{
	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
	}
}
