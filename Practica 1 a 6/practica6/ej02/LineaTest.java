package practica6.ej02;

import static org.junit.Assert.*;
<<<<<<< HEAD
import org.junit.Test;

	public class LineaTest
	{
		Linea linea=new Linea(0,0,2,2);
		Linea linea2=new Linea(1,0,3,2);
		Linea linea3=new Linea(1,1,7,2);

		@Test
		public void testGetPendiente1()
		{
			assertEquals(1, linea.getPendiente(),0);
		}
		
		@Test
		public void testGetPendiente2()
		{
			assertEquals(3, linea.getPendiente(),0);
		}
		
		@Test
		public void testGetDistancia1()
		{
			assertEquals(2.8, linea.getPendiente(),2);
		}
		
		@Test
		public void testGetDistancia2()
		{
			assertEquals(5, linea.getPendiente(),2);
		}
		
		@Test
		public void testEsParalela1()
		{
			assertEquals(true, linea.EsParalela(linea2));
		}

		@Test
		public void testEsParalela2()
		{
			assertEquals(true, linea.EsParalela(linea3));
		}
	}


=======
import practica6.ej02.Linea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineaTest {
	double x0=2.0;
	double x1=2.0;
	double y0=6.0;
	double y1=8.0;
		
	Linea nuevaLinea = new Linea(x0, y0, x1, y1);
	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void testLinea() {
		
	}

	@Test
	public void testGetPendiente() {
		Assert.assertEquals(1.00, nuevaLinea.getPendiente(),00);
		Assert.assertSame(ArithmeticException(),nuevaLinea.getPendiente(),00);
		
	}

	/*@Test
	public void testGetDistancia() {
		Assert.assertEquals(expected, actual, delta);
	}

	@Test
	public void testEsParalela() {
		fail("Not yet implemented");
	}*/

}
>>>>>>> dfde6f54193b9217626f43d03030dd6211b73d7a
