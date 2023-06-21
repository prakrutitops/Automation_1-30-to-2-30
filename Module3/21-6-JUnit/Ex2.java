package unit2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class Ex2 
{
	
		@Test
		public void test()
		{
			int a=5,b=6,c=5;
			int[] a1= {1,2,3};
			int[] b1= {1,2,3,5};
			String s1=null,s2="Tops";

			
			
			//assertEquals(a,b);
			//assertEquals(a,c);
			//assertSame(a,b);
			//assertSame(a,c);
			//assertNotSame(a,b);
			
			//assertTrue(a>b);
			//assertTrue(a<b);
			//assertFalse(a>b);
		
			assertArrayEquals(a1, b1);
		
		}
	
	
}
