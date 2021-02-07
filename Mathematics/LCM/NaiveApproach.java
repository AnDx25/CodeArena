/*
	In this approach find max(a,b) and check if both a and b divides it and if not then increase it and repeat the same process until we find that number satisfying condition

TC : O(a*b-max(a,b))
	
*/
import java.util.*;
import java.io.*;

public class NaiveApproach
{
	public static int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	public static int lcm(int a,int b)
	{	
		int res=max(a,b);
		while(true)
		{
			if(res%a==0 && res%b==0)
			{
				break;
			}
			res++;
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(lcm(a,b));
	}
}
