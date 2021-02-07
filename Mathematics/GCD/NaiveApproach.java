/*
	For gcd(a,b) find min(a,b)
	lets say res=min(a,b)
	then check if a%res==0 && b%res==0 if true then res is gcd
	else res=res-1 and check if if a%res==0 && b%res==0 if true then res is gcd 
	else res=res-2 
	and so on until res=0
	
	TC : theta(min(a,b))

*/
import java.io.*;
import java.util.*;

public class NaiveApproach
{
	public static int min(int a,int b)
	{
		return (a>b)?b:a;
	}	
	public static int gcd(int a, int b )
	{
		int res=min(a,b);
		while(res>0)
		{
			if(a%res==0 && b%res==0)
			{
				break;
			}
			res--;
		}
		return res;	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
	}
}






