import java.io.*;
import java.util.*;
/**
 * TC : theta(n*sqrt(n))
*/
public class NaiveApproach
{   
    
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0|| n%3==0) return false;
        for(int i=5;i<=Math.sqrt(n);i+=6)
        {
            if(n%i==0){
                return false;
            }
            if(n%(i+2)==0)
            {
                return true;
            }
        }
        return true;
    }
    public static void printPrime(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
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
