
package sabbir.anisulislamvideo;

import java.util.Scanner;


public class Series6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n , sum = 1;
        System.out.println("Enter last point of the series : ");
        
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            
            sum = sum * i;
            System.out.print(i+" * ");
        }
        System.out.println(" ");
        System.out.println("The sum of this series is : "+sum);
        
        
    }
    
}
