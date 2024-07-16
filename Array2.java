package BeginnerJava;

import java.util.Scanner;

public class Array2 
{
  public static void main (String [] args)
  {
	  Scanner input = new Scanner (System.in);
	  
	  double sum = 0;
	  
	  double [] number = new double [5];
	  
	  System.out.print("Please enter five numbers : ");
	  
	  for (int i = 0; i < 5; i++)
	  {
		  number [i] = input.nextDouble();
	  }
	  
	  for (int j = 0; j < 5; j++)
	  {
		  sum = sum + number[j];
	  }
	  
	  
	  
	  System.out.println("The sum is : "+sum);
	  System.out.println("The average is : "+sum/5);
	  
	  
	  
  }
}
