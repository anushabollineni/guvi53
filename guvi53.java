import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int num, rem=0, sum=0, temp;
        Scanner scan = new Scanner(System.in);
		
     
        System.out.print("Enter the Number : ");
        num = scan.nextInt();
		
        
        temp = num;
		
        while(num>0)
        {
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
		
        System.out.print("Sum of Digits of " +temp+ " is : " +sum);        
    }
}
	
