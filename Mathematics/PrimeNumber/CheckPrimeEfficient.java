/*
	Time Complexity : Worst Case : When n is a prime number then we will check from 2 to sqrt(n) to find it out.
	So O(sqrt(n))

*/
import java.util.*;
import java.io.*;   
import java.lang.Math;
public class CheckPrimeEfficient{
    public static boolean primeCheck(int n)
    {
	if(n==1)
	{
		return false;
	}
	
        	for(int i=2;i<=Math.sqrt(n);i++)
        	{
            	if(n%i==0)
            	{
                	return false;
            	}
           
        	}
	return true;
    }
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  
	
        if(primeCheck(n))
        {
            System.out.println(n+" is Prime");
        }
        else
        {
            System.out.println(n+" is not Prime");
        }

     }
}