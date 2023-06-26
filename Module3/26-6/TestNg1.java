import org.testng.annotations.Test;

public class TestNg1 
{
	
	@Test(priority = 3)
	public void alpha()
	{
		System.out.println("alpha");
	}
	
	@Test(priority = 1)
	public void gama()
	{
		System.out.println("gama");
	}
	
	@Test(priority = 2)
	public void beta()
	{
		System.out.println("beta");
	}
	
	
	
}
