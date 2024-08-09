package lab7;

import java.util.Scanner;

public class Problem2 {
	
	
	public static void main (String [] args)
	{
		 Sum();
	}
	
	public static void Sum() {
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
	    System.out.println("The summation is : "+sum);
	}
	
	

}
