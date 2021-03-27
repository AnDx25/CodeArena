import java.io.*;
import java.util.*;
import java.util.Arrays; 

/**
 * TC : theta(log(n))
 * SC : theta(1)
*/
public class EfficientApproachIterative
{   
    
    public static int power(int x,int n)
    {
        int res=1;
        while(n>0)
        {
            if(n%2!=0)
            {
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int pow=power(n,x);
        System.out.println(pow);
        
    }
}
