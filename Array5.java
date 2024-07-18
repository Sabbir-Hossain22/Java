package BeginnerJava;

import java.util.Scanner;

public class Array5 
{
  public static void main(String[] args)
  {
	  Scanner input = new Scanner(System.in);
	  
	  int [] [] A = new int [2] [3];
	  int [] [] B = new int [2] [3];
	  int [] [] C = new int [2] [3];
	  
	  System.out.println("Enter the number for A matrix :");
	  
	  
	  
	  // Getting input from A matrix
	  
	  
	  
	  for (int row = 0; row < 2 ; row ++) {
		  
		  for (int col = 0; col < 3; col++)
		  {
			  System.out.printf("A [%d] [%d] = ",row,col);
			  
			  A [row][col] = input.nextInt();
		  }
	  }
	  
	  System.out.println();
	  
	  
	  
	// Getting input from B matrix
	  
	  
	  
		  System.out.println ("Enter the value for B matrix :");
		  
			  for (int row = 0; row < 2 ; row ++) {
				  
				  for (int col = 0; col < 3; col++)
				  {
					  System.out.printf("B [%d] [%d] = ",row,col);
					  
					  B [row][col] = input.nextInt();
				  }
			  }
			
	  
	  
	  // Printing A matrix
			  
			  
			  
      System.out.println();
	  
	  
	  System.out.print("A = ");
	  
	  for (int row = 0; row < 2 ; row ++) {
		  
		  for (int col = 0; col < 3; col++)
		  {
			  
			  System.out.print ("\t "+A[row][col]);
		  }
		  System.out.println();
	  }  
	    
		  
		  // Printing B matrix
	  
	 
		  
		  System.out.println("B = ");
		  
		  for (int row = 0; row < 2 ; row ++) {
			  
			  for (int col = 0; col < 3; col++)
			  {
				  
				  System.out.print ("\t "+B[row][col]);
			  }
			  System.out.println();
		  }
		  
		  
		  //Adding A and B matrix 
		  
		  for(int row = 0; row < 2 ; row ++)
		  {
			  for(int col = 0; col < 3; col++)
			  {
				  C[row][col] = A[row][col] + B[row][col];
			  }
		  }
		  
		  
		  
		  //Printing (A + B) matrix.
		  
		  
		    System.out.println();
		    System.out.println("The sum of A & B matrix are : ");
		    System.out.println();
		    
		    
		    
		  
		  for(int row = 0; row < 2 ; row ++)
		  {
			  for (int col = 0; col < 3 ; col++)
			  {
				  System.out.print ("\t "+C[row][col]);
			  }
			  System.out.println();
		  }
  
     }
  
  
}
