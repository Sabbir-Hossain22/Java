package lab11;

public class Test {
	
	public static void main(String[] args) {
		
		Circle c1= new Circle();
		System.out.println("the area of circle of radius "+c1.radius+" is "+c1.getArea());
		//create a circle with radius = 25;
		Circle c2 = new Circle(25);
		System.out.println("the Circumference of circle of radius "+c2.radius+" is "+c2.getArea());
		System.out.println(Circle.getObjectCount());
		c1.setRadius(100);
		System.out.println("the area of circle of radius "+c1.radius+" is "+c1.getArea());
			
	    
	    Circle c3 = new Circle();
	    System.out.println("Number of Circle objects created: " + c3.getObjectCount());
	}

}
