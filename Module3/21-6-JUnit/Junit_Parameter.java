package unit2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Junit_Parameter 
{
	
	static Addition a1=null;
	int fno,sno,eno;
	
	
	//constructor
	public Junit_Parameter(int fno,int sno,int eno)
	{
		// TODO Auto-generated constructor stub
		
		this.fno=fno;
		this.sno=sno;
		this.eno=eno;
	}
	
	@Before
	public  void beforetest()
	{
		a1 = new Addition();
	}
	
	
	@Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{1,2,3} ,{5,6,12}});
	}
	
	@Test
	public void test()
	{
		System.out.println("Your Expected Value is... "+eno);
		assertEquals(eno, a1.sum(fno, sno));
	}
	@After
	public  void aftertest()
	{
		System.out.println("closed");
	}
	
	
	
	
	
}
