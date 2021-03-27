import java.io.*;
import java.util.*;
import java.util.Arrays; 

/*
Approach : Shifting the set bit of 1 to the Kth place of that number and then taking and of right shifted 1 with n if kth bit of n is set then output will not be zero else it will be zero

Ex : 1: 0001
    k=3
    n=5 :       0101
                    &
    1>>(k-1):   0100
    ---------------------
                0100
    ---------------------            
*/

public class KthSetBit
{
    public static String isSet(int n,int k)
    {
        if((n&(1<<(k-1)))!=0)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        System.out.println(isSet(n,k));
    }
}