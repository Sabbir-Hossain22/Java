package lab11;

public class Circle {
	
	    private static int objectCount = 0;
		
	    double radius;
		
	    public Circle() {
	        radius = 10;
	        objectCount++;
	    }
		
	    public Circle(double newRadius) {
	        radius = newRadius;
	        objectCount++;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    public double getCircumference() {
	        return Math.PI * 2 * radius;
	    }

	    public void setRadius(double newRadius) {
	        radius = newRadius;
	    }

	    public static int getObjectCount() {
	        return objectCount;
	    }
	}



