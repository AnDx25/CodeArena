import java.io.*;
import java.util.*;
import java.util.Arrays; 

/**
 * TC : theta(log(n))
 * SC : theta(log(n))
*/
public class EfficientApproachRecursive
{   
    
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int temp=power(x,n/2);
        temp=temp*temp;
        if(n%2==0)
        {
            return temp;
        }
        else
        {
            return temp*x;
        }
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
