package arrayofobj;

public class ArrayOfCircles {
	
	public static void main (String[] args)
	{
		Circle arr [] = new Circle[3];
		for (int count= 0; count<arr.length;count++)
		{
			arr[count]= new Circle (Math.random()*10);
		}
		
		printArea(arr);
	}
	
	public static void printArea(Circle[]arrayname)
	{
		System.out.println("Radius "+"\t \t \t \tArea");
		for (int counter = 0; counter<arrayname.length;counter++)
		{
			System.out.println(arrayname[counter].radius+"\t\t"+arrayname[counter].getArea());
		}
		
	}

}
