package unit1;

import org.junit.*;

public class AnnotationDemo 
{
	
	@Test
	public void pqr()
	{
		System.out.println("alpha");
	}
	
	@Test
	public void abcd()
	{
		System.out.println("beta");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("2");
	}
	
	@Test
	public void xyz()
	{
		System.out.println("gama");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("3");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("1");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("4");
	}
	
}
