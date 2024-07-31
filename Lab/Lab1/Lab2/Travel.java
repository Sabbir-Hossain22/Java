package lab4;

import java.util.Scanner;

public class Travel {
	
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the input for mood :");
		int mood = input.nextInt();
		
		if (mood == 0)
		{
			System.out.println("Home");
			
		}
		else if (mood == 1)
		{
			System.out.println("Sikim");
		}
		
		else if (mood == 2)
		{
			System.out.println("Bandarban");
		}
		else if (mood == 3)
		{
			System.out.println("Darjiling");
		}
		else if (mood == 4)
		{
			System.out.println("France");
		}
		else if (mood == 5)
		{
			System.out.println("Srimongol");
		}
		else if (mood == 6)
		{
			System.out.println("Amazon");
		}
		else if (mood == 7)
		{
			System.out.println("Bali");
		}
		else if (mood == 8)
		{
			System.out.println("Cox Bazar");
		}
		else if (mood == 9)
		{
			System.out.println("Macca");
		}
		else if (mood == 10)
		{
			System.out.println("Meghalaya");
		}
		else 
		{
			System.out.println("Invalid Input");
		}
		
	}

}
