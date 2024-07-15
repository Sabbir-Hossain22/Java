
package sabbir.anisulislamvideo;

import java.util.Scanner;


public class Series4 {
    
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System .in);
        double num, sum=0;
        
        System.out.println("Enter the last number : ");
        num = input.nextDouble();
        
        for (double i = 1.5; i <= num; i++) 
        {
            System.out.print(i+"+");
            sum = sum+i;
        }
        System.out.println("");
        System.out.println("The sum of this series : "+sum);
    }
}

    

