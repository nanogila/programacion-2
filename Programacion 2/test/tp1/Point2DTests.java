package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Point2DTests {

	@Test
	public void testGetDistance() {
		Point2D aPoint = new Point2D (0, 0);
		Point2D anotherPoint = new Point2D (3, 4);
		double result = aPoint.getDistance(anotherPoint);
		assertEquals(5, result, 0.01);
	}
	@Test
	public void testAdd() {
			Point2D aPoint = new Point2D (1, 1);
			Point2D anotherPoint = new Point2D (3, 2);
			Point2D result = aPoint.add(anotherPoint);
			Point2D expectedResult = new Point2D (4, 3);
		assertEquals(expectedResult, result);
		

	}
	@Test
	public void testgetX() {
			Point2D aPoint = new Point2D (1, 1);
			Point2D anotherPoint = new Point2D (3, 2);
			Point2D result = aPoint.add(anotherPoint);
			Point2D expectedResult = new Point2D (4, 3);
		assertEquals(expectedResult.getX(), result.getX());
	}
	@Test
	public void testgetY() {
			Point2D aPoint = new Point2D (1, 1);
			Point2D anotherPoint = new Point2D (3, 2);
			Point2D result = aPoint.add(anotherPoint);
			Point2D expectedResult = new Point2D (4, 3);
		assertEquals(expectedResult.getY(), result.getY());
	}
}
