
package sabbir.anisulislamvideo;

import java.util.Scanner;


public class Series3 {
    
          public static void main(String[] args) 
    {
        Scanner input = new Scanner(System .in);
        int num, sum=0;
        
        System.out.println("Enter the last number : ");
        num = input.nextInt();
        
        for (int i = 2; i <= num; i=i+2) 
        {
            System.out.print(i+"+");
            sum = sum+i;
        }
        System.out.println("");
        System.out.println("The sum of this series : "+sum);
    }
}

