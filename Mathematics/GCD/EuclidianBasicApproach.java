/*
	Idea : gcd(a,b)=gcd(a-b,b)
	lets say gcd(a,b)=g;
	So a=gx and b=gy since g is gcd of a and b thus gcd(x,y)=1
	So (a-b)=g(x-y) thus gcd(a-b,b)=g;
*/
import java.io.*;
import java.util.*;

public class EuclidianBasicApproach
{
	public static int gcd(int a, int b )
	{
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		return a;	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
	}
}







