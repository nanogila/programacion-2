package tp2;

public class Segment {
	private Point2D pointA;
	private Point2D pointB;
public Segment (Point2D aPoint, Point2D anotherPoint) {
	pointA = aPoint;
	pointB= anotherPoint;
}
public Point2D returnPointA(){
	return pointA;
}
public Point2D returnPointB(){
	return pointB;
}
public double length () {
	return pointA.getDistance(pointB);
}
}
