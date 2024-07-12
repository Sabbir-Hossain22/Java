
package sabbir.anisulislamvideo;

import java.util.Scanner;


public class FactorialDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in ) ;
                
                int f, sum=1;
                
                System.out.println("Enter the last point of the number : ");
                
                f = input.nextInt();
                
                for (int i = f; i >= 1; i--) {
                    
                    sum = sum*i;
                    
                    
            
        }
                System.out.println("The sum of this factorial is : "+sum);
                
                
    }
    
}
