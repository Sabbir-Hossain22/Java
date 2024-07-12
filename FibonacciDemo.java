
package sabbir.anisulislamvideo;

import java.util.Scanner;


public class FibonacciDemo 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        int num;
        System.out.println("Enter the value for how many fibonacci number you want to see : ");
        num = input.nextInt();
        
        int first = 0, second = 1, fibo;
        
        System.out.print(first+ " "+second);
        
        for (int i = 3; i <= num; i++) 
        {
            fibo = first + second;
            System.out.print(" "+fibo);
            
            first = second;
            second = fibo;
        }
    }
}
