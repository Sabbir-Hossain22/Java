package lab5;

import java.util.Scanner;

public class problem1 {
	
	public static void main(String [] args)
	{
		
		//Generate random numbers and type cast.
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Find the summation of : " +num1 + " and : " +num2);
		int sum = input.nextInt();
		// if number 1 is smaller than number 2 we will swap 
		if(num1 < num2);
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println(" Substract "+ num2 + " from "+num1 );
		int sub = input.nextInt();
		
		if (num1 + num2 ==sum)
		{
			System.out.println("your summation is correct");
			
		}
		else 
		{
			System.out.println("Your summation is incorrect");
		}
		
		if (num1 - num2 == sub)
		{
			System.out.println("Your substraction is correct");
		}
		else 
		{
			System.out.println("Your substraction is incorrect");
		}
	}

}
/*
  
  ticketprice = (ages >= 16)? 20 : 10
  
    if (x > 10)
    {
   Score = Scale * 3 ;
   }
   else
   {
   Score = Scale *4;
   }
   
   if (income > 10000)
   */
 
