package tp2;
import static org.junit.Assert.*;
import org.junit.*;

public class TriangleTests {
	@Test
    public void testPerimeter() {
		Point2D pointA = new Point2D(0, 4);
		Point2D pointB = new Point2D(1, 1);
		Point2D pointC = new Point2D(3, 0);		
        Triangle tester = new Triangle(pointA, pointB, pointC); // MyClass is tested
        double result = tester.perimeter();
        // assert statements
        assertEquals(10.3983456, result, 0.0000001);
}
	@Test
    public void testIsoceles() {
		Point2D pointA = new Point2D(0, 4);
		Point2D pointB = new Point2D(1, 1);
		Point2D pointC = new Point2D(3, 0);		
        Triangle tester = new Triangle(pointA, pointB, pointC); // MyClass is tested
        boolean result = tester.isIsoceles();
        // assert statements
        assertFalse("deberia dar falso", result);
}
	@Test
    public void testIsocelesTrue() {
		Point2D pointA = new Point2D(0, 0);
		Point2D pointB = new Point2D(2, 0);
		Point2D pointC = new Point2D(0, 1);		
        Triangle tester = new Triangle(pointA, pointB, pointC); // MyClass is tested
        boolean result = tester.isIsoceles();
        // assert statements
        assertTrue("deberia dar verdadero", result);
}
	@Test
    public void testEquilateral() {
		Point2D pointA = new Point2D(0, 4);
		Point2D pointB = new Point2D(1, 1);
		Point2D pointC = new Point2D(3, 0);		
        Triangle tester = new Triangle(pointA, pointB, pointC); // MyClass is tested
        boolean result = tester.isEquilateral();
        // assert statements
        assertFalse("deberia dar falso", result);
}
	@Test
    public void testEquilateralTrue() {
		Point2D pointA = new Point2D(0, 0);
		Point2D pointB = new Point2D(3, 4);
		Point2D pointC = new Point2D(6, 8);		
        Triangle tester = new Triangle(pointA, pointB, pointC); // MyClass is tested
        boolean result = tester.isEquilateral();
        // assert statements
        assertTrue("deberia dar verdadero", result);
}
	@Test
    public void testScaleneTrue() {
		Point2D pointA = new Point2D(1, 6);
		Point2D pointB = new Point2D(4, 1);
		Point2D pointC = new Point2D(0, 23);		
        Triangle tester = new Triangle(pointA, pointB, pointC); // MyClass is tested
        boolean result = tester.isScalene();
        // assert statements
        assertTrue("deberia dar verdadero", result);
}
}
