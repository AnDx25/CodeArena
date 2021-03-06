import java.util.*;
import java.io.*;   
import java.lang.Math;
public class CheckPrimeMoreEfficient{
    
    public static boolean isPrime(int n)
    {
        if(n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i<=Math.sqrt(n);i+=6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       if(isPrime(n))
       {
           System.out.println(n+" is Prime");
       }
       else
       {
           System.out.println(n+" is not Prime");
       }
        
     }
}