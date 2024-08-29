package lab20;

public class StrangeClass implements DrStrange, CaptainPlanet {
	
	public int strangeMethod ()
	{
		return (CaptainPlanet.r*2+v+DrStrange.r*a+z);
	}
	public void captainMethod()
	{
		System.out.println("This is strange captain");
	}

}
