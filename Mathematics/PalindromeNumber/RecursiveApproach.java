import java.io.*;
import java.util.*;

public class RecursiveApproach
{
	public static int reverseOfNumber(int rev,int n)
	{
		if(n==0)
		{
			return rev;
		}
		//Taking out last digit and adding to rev*10;
		rev=rev*10+n%10;
		return reverseOfNumber(rev,n/10);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Find reverse
		int rev=0;
		int n_rev=reverseOfNumber(rev,n);
		if(rev==n_rev)
		{
			System.out.println(n+"  is a palindrome number");
			System.out.println(n+" is not a palindrome number");
		}
	}
}
