package lab21;

public class Circle {
	
	double radius;
	Circle (double rad)
	{
		radius= rad;
		
	}
	
	public String getArea()
	
	{
		return "The area of the circle of radius"+ radius+"+is: "+ Math.PI*radius*radius;
	}

}
