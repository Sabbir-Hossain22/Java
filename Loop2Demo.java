
package sabbir.anisulislamvideo;

import java.util.Scanner;

public class Loop2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, sum=0;
        
        System.out.println("Enter starting point : ");
        num1 = input.nextInt();
        
        System.out.println("Enter end point : ");
        num2 = input.nextInt();
        
        
        for (int i = num1; i <= num2; i++)
        {
            
            sum = sum + i;
            
        }
        
        System.out.println("The sum is : "+sum);
    }
    
}
