import org.testng.annotations.*;


public class AllAnnotationsEx 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite...");
	}
	
	@AfterSuite
	public void aftesuite()
	{
		System.out.println("After Suite...");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class...");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class...");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test...");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test...");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method...");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method...");
	}
	@Test
	public void test()
	{
		System.out.println("This is Main Test....");
	}
	@Ignore
	@Test
	public void test1()
	{
		System.out.println("This is Main Test1....");
	}
}
