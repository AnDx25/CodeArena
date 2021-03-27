import java.io.*;
import java.util.*;
import java.util.Arrays; 

/**
 * TC : theta(n*log(log(n)))
*/
public class SieveApproach
{   
    
    public static void printPrime(int n)
    {
        int isPrime[]=new int [n+1];
        Arrays.fill(isPrime,1);
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i]==1)
            {
                System.out.println(i);
                for(int j=i*i;j<=n;j+=i)
                {
                    isPrime[j]=0;
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPrime(n);
        
    }
}
