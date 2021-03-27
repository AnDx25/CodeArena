/*
TC : theta(n);
*/

import java.io.*;
import java.util.*;

public class AllDivisors
{
    public static int divisors(int n,int i)
    {
        if(i>n)
        {
            return 0;
        }
        if(n%i==0)
        {
            System.out.println(i);
            
        }
        divisors(n,i+1);
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        divisors(n,1);
        
    }
}