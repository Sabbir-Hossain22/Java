
package sabbir.anisulislamvideo;

import java.util.Scanner;

public class ReversNumber
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        int num, sum = 0, temp, rem;
        
        System.out.println("Enter any integer number : ");
        num = input.nextInt();
        
        temp = num;
        
        while (temp != 0)
        {
            rem = temp % 10;
            sum = sum * 10 + rem;
            
            temp = temp / 10;
        }
        
        System.out.println("The reverse numbers are : "+sum);
        
    }
}
