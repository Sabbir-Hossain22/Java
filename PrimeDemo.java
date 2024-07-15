
package sabbir.anisulislamvideo;

import java.util.Scanner;


public class PrimeDemo {
    
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int count = 0 ;
        
        System.out.println("Enter any positive integer : ");
        int num = input.nextInt();
        
        
        for (int i = 2; i < num; i++) 
        {
           if (num % i == 0) 
           {
               count++;
               break;
           }
        }
        if (count == 0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
        
    }
    
    
    
}
