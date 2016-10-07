package teorica;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;



public class CollectionsTests {
	@Test(expected = IndexOutOfBoundsException.class) 
	public void empty() { 
	     new ArrayList<Object>().get(0); 
	}
	
	@Test
	public void testingCollections() { 
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Collection<Integer> aCollection = lista;
		assertEquals(0, aCollection.size());

		aCollection.add(10);
		aCollection.add(5); 
		assertEquals(2, aCollection.size());
		assertEquals(new Integer(10), lista.get(0));

		lista.remove(new Integer(10));
		assertEquals(1, lista.size());
		assertEquals(new Integer(5), lista.get(0));

		assertFalse(lista.contains(new Integer(2)));
		assertTrue(lista.contains(new Integer(5)));
	}
}
