package lab7;

import java.util.Scanner;

public class Problem1 {
	
		
	public static void main (String[] args)
	{
		int num = Sum();
		System.out.println("The sumation is : "+num);
	}
	
	public static int Sum() {
	    int sum = 0;
	    Scanner scanner = new Scanner(System.in);
	    while (true) {
	        System.out.print("Enter a number or enter 0 to stop): ");
	        int num = scanner.nextInt();
	        if (num == 0) {
	            break;
	        }
	        sum += num;
	    }
	    scanner.close();
	    return sum;
	}
		
		
	}


