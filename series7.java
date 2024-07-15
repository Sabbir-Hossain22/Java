
package sabbir.anisulislamvideo;

import java.util.Scanner;


public class series7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double n , sum = 1.0;
        System.out.println("Enter last point of the series : ");
        
        n = input.nextDouble();
        for (double i = 1.5; i <= n; i++) {
            
            sum = sum * i;
            System.out.print(i+" * ");
        }
        System.out.println(" ");
        System.out.println("The sum of this series is : "+sum);
        
        
    }
}