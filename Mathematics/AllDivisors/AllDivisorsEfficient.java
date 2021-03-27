import java.io.*;
import java.util.*;
/**
 * TC : theta(sqrt(n))+theta(sqrt(n))
*/
public class AllDivisorsEfficient
{
    public static void divisors(int n)
    {
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
        for(int i=(int)Math.sqrt(n);i>=1;i--)
        {
            if(n%i==0)
            {
                System.out.println(n/i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        divisors(n);
        
    }
}
