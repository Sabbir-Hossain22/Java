
import java.util.Scanner;


public class SumEven {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       int m,n,sum=0;
       
        System.out.print("Enter the value of m : ");
        m = input.nextInt();
        
        System.out.print("Enter the value of n : ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) 
        {
            if (i % 2 == 0)
            {
                sum = sum + i;
                System.out.println(i);
            }
            
            
        }
        System.out.println("The sum of all even numbers betweeen m to n is : " +sum);
        
        
    }
    
}
