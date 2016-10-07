package tp3;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;

//import edu.austral.curso2016c2.prog2.practicas.guia3.ej01.src.ClaseA;

public class ClaseATests {
	@Test
	public void testM1() {
		ClaseA claseA = new ClaseA();
		assertEquals(3, claseA.m1());
	}

	@Test
	public void testM2() {
		ClaseA claseA = new ClaseA();
		assertEquals(10, claseA.m2());
	}

	@Test
	public void testM3() {
		ClaseA claseA = new ClaseA();
		assertEquals(3, claseA.m3());
	}
@Rule 
public ExpectedException exception = ExpectedException.none();
	@Test
	public void testM4() {
		exception.expect(StackOverflowError.class);
		ClaseA claseA = new ClaseA();
		assertEquals(0, claseA.m4());
	}

}
