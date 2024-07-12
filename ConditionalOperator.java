import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {
        
        Scanner input = new  Scanner (System .in);
        
        int num1 , num2, large ;
        
        System.out.println("Enter any Integer Number1 : ");
        num1 = input.nextInt();
        
         System.out.println("Enter any Integer Number2 : ");
        num2 = input.nextInt();
        
        large = (num1 > num2) ? num1 : num2 ; //conditional operator 
        System.out.println("The Maximum Number is : "+large);
    }
    
}
