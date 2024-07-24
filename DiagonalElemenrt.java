package BeginnerJava;

import java.util.Scanner;

public class DiagonalElemenrt 
{
  public static void main (String [] args)
  {
	  Scanner input = new Scanner (System.in);
	  
	  int [][] A = new int [3][3];
	  int SumOfDiagonalElements = 0;
	  int SumOfUpperTriangleElements = 0;
	  int SumOfLowerTriangleElements = 0;
	  
	  System.out.println ("Enter the element of this matrix : ");
	  
	  for (int row = 0; row < 3; row++)
	  {
		  for (int col = 0; col < 3; col++)
		  {
			  A [row][col] = input.nextInt();
		  }
	  }
	  
	  for (int row = 0; row < 3; row++)
	  {
		  for (int col = 0; col < 3; col++)
		  {
			  if (row == col)
			  {
				  SumOfDiagonalElements = SumOfDiagonalElements + A[row][col];
			  }
			  
			  if (row < col)
			  {
				  SumOfUpperTriangleElements = SumOfUpperTriangleElements + A[row][col];
			  }
			  
			  if (row > col)
			  {
				  SumOfLowerTriangleElements = SumOfLowerTriangleElements + A [row][col];
			  }
		  }
	  }
	  
	  System.out.println("Sum of Diagonal Elements : "+SumOfDiagonalElements);
	  System.out.println("Sum of Upper Triangle Elements : "+SumOfUpperTriangleElements);
	  System.out.println("Sum of Lower Triangle Elements : "+SumOfLowerTriangleElements);
  }
}
