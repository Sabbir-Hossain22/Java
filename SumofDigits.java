
package sabbir.anisulislamvideo;

import java.util.Scanner;


public class SumofDigits 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int num, temp, rem, sum = 0;
        
        System.out.println("Enter any number : ");
        num = input.nextInt();
        
        temp = num;
        
        while (temp != 0)
        {
            rem = temp % 10;
            sum = sum + rem;
            
            temp = temp / 10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
