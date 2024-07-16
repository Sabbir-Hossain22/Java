package BeginnerJava;

import java.util.Scanner;

public class ArmstrongDemo 
{
   public static void main (String [] args ) 
   {
	   Scanner input = new Scanner (System.in);
	   
	   int sum = 0, r, num, temp;
	   
	   System.out.println("Enter number for checking Armstrong : ");
	   num = input.nextInt();
	   
	   temp = num;
	   
	   while(temp != 0)
	   {
		   r = temp % 10;
		   sum = sum + r * r * r;
		   temp = temp / 10;
	   }
	   if (num == sum)
	   {
		   System.out.println("The number is Armstrong");
	   }
	   else
	   {
		   System.out.println("Not a Armstrong");
	   }
   }
}
