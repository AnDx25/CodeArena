import java.io.*;
import java.util.*;
import java.util.Arrays; 

/*
Approach
-----------------------
    n: 5: 0101
    
   res+= 0101 & 0001 = 1(res=1)
   0101>>1: 0010
   
   res+=0010 & 0001 =0
   0010>>1:0001
   
   res+=0001 & 0001 =1(res=2)
   
   ----------------------------------
   
   TC : In worst Case number of bits present in Binary Number
        theta(Total Bits in n)
**/

public class NaiveApproach
{   
    public static int count(int n)
    {
        int res=0;
        while(n>0)
        {
            res+=(n&1);
            n=n>>1;
        }
        return res;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        
        System.out.println(count(n));
    }
}