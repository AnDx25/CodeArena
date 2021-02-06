import java.io.*;
import java.util.*;
import java.lang.Math;
/*
TC: theta(1)
*/

public class LogarithmicApproach
{
	public static int countDigit(int n)
	{
		return (int)Math.floor(Math.log10(n)+1);	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(countDigit(n));
	}
}
