import java.io.*;
import java.util.*;
import java.util.Arrays; 



public class NaiveApproach1
{   
    public static int count(int n)
    {
        int c=0;
        while(n>0)
        {
            if(n%2!=0)
            {
                c++;
            }
            n=n/2;
        }
        return c;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        
        System.out.println(count(n));
    }
}