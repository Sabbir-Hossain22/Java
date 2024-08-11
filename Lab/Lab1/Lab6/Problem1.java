package lab8;

import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		
		double b = input.nextDouble();
		
		
		if (b==3)
		{
		public void Triangle () 
		{
			double a, b, c;
			
			
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			 if (a>b || b>c || b>a ||c>b)
			
			double s = a+b+c/2;
			 
			double area = Math.sqrt(s(s-a)(s-b)(s-c)/2);
			
			System.out.println("Area : is "+area);
			
		   else if (b==0)
			{
				System.out.println("Invalid Input");
			}
			
		}
		}
		
		
		if (b==2)
			
		{
		public void Rectangle ()
		{
			double a,b;
			a = input.nextDouble();
			b = input.nextDouble();
			
		   double area = a*b;
		   System.out.println("Rectangle is : "+area);
		}
		}
		if (b==1)
			
		{
		public void Circle()
		{
			double r
			
			r = input.nextDouble();
			
			double area = Math.PI*r*r;
			System.out.println("Circle is : "+area);
		}
		
	}
		
	}
}


