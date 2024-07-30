package basicjava;

class x
{     
	public x(int x)     
	
	{     
		System.out.println(1);     
		
	} 
	
}  
     class y extends x
     
     {     
    	 public y()     
    	 
    	 {         
    		 super(5);        
    		 
    		 System.out.println(2);     
    		 
    	 } 
    	 
     }  
     
     public class Main1 
     
     { 	
    	 
    	 public static void main(String[] args) 
    	 
    	 { 	    
    		 
    		 x ob1 = new x(89); 	    
    		 
    		 y ob2 = new y(); 		 	
    		 
    	 }
    	 
     } 
	