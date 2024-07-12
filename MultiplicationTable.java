
package sabbir.anisulislamvideo;

import java.util.Scanner;

public class MultiplicationTable 
{
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int num, fnl, result ;
        
        System.out.println("Enter starting positive integer for Multiplication table : ");
        
        num = input.nextInt();
        
        System.out.println("Enter final positive integer for Multiplication table : ");
        fnl =input.nextInt();
        
        for (int i = num; i <=fnl ; i++) {
            
            for (int j = 1; j <= 10; j++) {
                
                result= i*j;
            
            System.out.println(i+ " X " +j+ " = "+result);
                
            }
            System.out.println(" ");
            
            
            
        }
    }
    
}
