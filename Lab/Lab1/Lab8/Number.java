package lab12;

public class Number {
	
	public int number;
	
	
	public Number (int number)
	{
		this.number = number;
	}
	public int sum (Number n1)
	{
		return this.number + n1.number;
	}
	
	public String toString()
	{
		return "The number is : "+number;
	}

}
