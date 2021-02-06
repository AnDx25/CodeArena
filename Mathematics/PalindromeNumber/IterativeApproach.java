import java.io.*;
import java.util.*;

/*
	If a digit is same on reading from right to left or left to right then it is a palindrome number

	Approach:
		1. Find The Reverse of A number
		2. Compare Original and reverse number
			if both equal then return true
			else return false
*/


public class IterativeApproach
{
	public static int reverseOfNumber(int n)
	{
		int rev=0;
		while(n!=0)
		{
			//Taking out last digit of number and adding it to rev*10;
			rev=rev*10+n%10;
			//Decrementing number by removing last digit which is added to rev*10;
			n=n/10;
		}
		return rev;
	}
	public static boolean isPallindrome(int n, int n_rev)
	{
		if(n==n_rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Find reverse of a number
		int n_rev=reverseOfNumber(n);
		//Compare both reverse and original number
		if(isPallindrome(n,n_rev))
		{
			System.out.println(n+" is a pallindrome number");
		}
		else
		{
			System.out.println(n+" is not a pallindrome number");
		}
	}
}
