package lab2;

public class question2 {
	
	public static void main (String[] args)
	{
		
	int birth = 0, death = 0, new_immitrant = 0, current_population = 0; 
			int result = 0; 
	
	 birth = (3600/7)* 24* 1825;
	 death = (3600/13)* 24 * 1825;
	 new_immitrant = (3600/45)* 24 * 1825;
	 current_population = 312032486;
	 
	 result = (birth + new_immitrant + current_population) - death;
	 
		
	System.out.println("The birth population of next 5 years is : "+birth);
	System.out.println("The death in next five years: "+death);
	System.out.println("The new immitrant in next five years: "+new_immitrant);
	
	System.out.println("The population after next five years : "+result);
	
	
	}

}
