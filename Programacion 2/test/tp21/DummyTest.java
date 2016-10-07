package tp21;
import static org.junit.Assert.*;

import org.junit.Test;

public class DummyTest {

	@Test
	public void testArea() {
		Point2D point1 = new Point2D(2, 4);
		Point2D point2 = new Point2D(0, 0);
		Point2D point3 = new Point2D(5, 0);
		Triangle aTriangle = new Triangle(point1, point2, point3);
		double result = aTriangle.area();
		assertEquals(10, result, 0.01);
	}

	@Test
	public void testIsoceles() {
		Point2D point1 = new Point2D(2, 4);
		Point2D point2 = new Point2D(0, 0);
		Point2D point3 = new Point2D(4, 0);
		Triangle aTriangle = new Triangle(point1, point2, point3);
		boolean result = aTriangle.isIsoceles();
		assertTrue(result);
	}
	@Test
	public void testPerimeter() {
		Point2D point1 = new Point2D(2, 4);
		Point2D point2 = new Point2D(0, 0);
		Point2D point3 = new Point2D(5, 0);
		Triangle aTriangle = new Triangle(point1, point2, point3);
		double result = aTriangle.perimeter();
		assertEquals(14.472135955, result, 0.01);
	}
	@Test
	public void testIsocelesFalse() {
		Point2D point1 = new Point2D(2, 4);
		Point2D point2 = new Point2D(0, 0);
		Point2D point3 = new Point2D(6, 0);
		Triangle aTriangle = new Triangle(point1, point2, point3);
		boolean result = !aTriangle.isIsoceles();
		assertTrue(result);
	}
	@Test
	public void testScalene() {
		Point2D point1 = new Point2D(2, 4);
		Point2D point2 = new Point2D(0, 0);
		Point2D point3 = new Point2D(6, 0);
		Triangle aTriangle = new Triangle(point1, point2, point3);
		boolean result = aTriangle.isScalene();
		assertTrue(result);
	}
	@Test
	public void testScaleneFalse() {
		Point2D point1 = new Point2D(2, 4);
		Point2D point2 = new Point2D(0, 0);
		Point2D point3 = new Point2D(4, 0);
		Triangle aTriangle = new Triangle(point1, point2, point3);
		boolean result = !aTriangle.isScalene();
		assertTrue(result);
	}
	@Test
	public void testEquilateral() {
		Point2D point1 = new Point2D(1, 1);
		Point2D point2 = new Point2D(0, 0);
		Point2D point3 = new Point2D(2, 0);
		Triangle aTriangle = new Triangle(point1, point2, point3);
		boolean result = aTriangle.isEquilateral();
		assertTrue(result);
	}
	@Test
	public void testEquilateralFalse() {
		Point2D point1 = new Point2D(2, 4);
		Point2D point2 = new Point2D(0, 0);
		Point2D point3 = new Point2D(5, 0);
		Triangle aTriangle = new Triangle(point1, point2, point3);
		boolean result = !aTriangle.isEquilateral();
		assertTrue(result);
	}
	
	
	
	

}
