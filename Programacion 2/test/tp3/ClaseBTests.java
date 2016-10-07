package tp3;

import static org.junit.Assert.*;

import org.junit.Test;

//import edu.austral.curso2016c2.prog2.practicas.guia3.ej01.src.ClaseB;

public class ClaseBTests {
	
	@Test
	public void testM1() {
		ClaseB claseB = new ClaseB();
		assertEquals(8, claseB.m1());
	}

	@Test
	public void testM2() {
		ClaseB claseB = new ClaseB();
		assertEquals(10, claseB.m2());
	}

	@Test
	public void testM3() {
		ClaseB claseB = new ClaseB();
		assertEquals(10, claseB.m3());
	}
 
	@Test
	public void testM4() {
		ClaseB claseB = new ClaseB();
		assertEquals(20, claseB.m4());
	}

	@Test
	public void testM5() {
		ClaseB claseB = new ClaseB();
		assertEquals(3, claseB.m5());
	}

	@Test
	public void testM7() {
		ClaseB claseB = new ClaseB();
		assertEquals(20, claseB.m7());
	}
}
