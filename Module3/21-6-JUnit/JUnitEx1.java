package unit2;

import org.junit.Test;

public class JUnitEx1 
{
	
	int a=5,b=6,c=5;
	
	
	@Test
	public void test()
	{
		Ex1 e1 =new Ex1();
		System.out.println(e1.add(a,b));
		
	}

	
	
}
