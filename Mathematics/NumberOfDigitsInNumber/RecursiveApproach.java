import java.io.*;
import java.util.*;
/*
TC: theta(log(n))
*/

public class RecursiveApproach
{
	public static int countDigit(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return 1+countDigit(n/10);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(countDigit(n));
	}
}
