import java.io.*;
import java.util.*;
import java.util.Arrays; 

/**
 * TC : theta(n)
*/
public class NaiveApproach
{   
    
    public static int power(int n,int x)
    {
        int pow=1;
        for(int i=1;i<=x;i++)
        {
            pow=pow*n;
        }
        return pow;
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
