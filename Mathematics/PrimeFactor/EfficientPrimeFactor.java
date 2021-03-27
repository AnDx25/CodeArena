import java.io.*;
import java.util.*;
import java.lang.Math;

/*
	TC : WorstCase : O(sqrt(n))
*/
public class EfficientPrimeFactor
{   
    public static void primeFactor(int n)
    {
        if(n<=1){
            
        }
        while(n%2==0)
        {
            System.out.print(2+"x");
            n=n/2;
        }
        while(n%3==0)
        {
            System.out.print(3+"x");   
            n=n/3;
        }
        for(int i=5;i<=Math.sqrt(n);i+=6)
        {
            while(n%i==0)
            {
                System.out.print(i+"x");
                n=n/i;
            }
            while(n%(i+2)==0)
            {
                System.out.print((i+2)+"x");
                n=n/(i+2);
            }
        }
        if(n>3)
        {
            System.out.print(n);
        }
        
        
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeFactor(n);
        
    }
}