package tp21;

public class Segment {
	private final Point2D[] points = new Point2D[2];
public Segment (Point2D aPoint, Point2D anotherPoint) {
	points[0]=aPoint;
	points[1]=anotherPoint;
}
public double length() {
	double distance = moveToOrigin().getDistance();
	System.out.println(distance);
	return distance;
}
private Point2D moveToOrigin() {
	int pointX1 = points[0].getX();
	int pointX2 = points[1].getX();
	int x;
	if (pointX1>pointX2) x = pointX1-pointX2;
	else x = pointX2-pointX1;
int pointY1 = points[0].getY();
int pointY2 = points[1].getY();
int y;
if (pointY1>pointY2) y = pointY1-pointY2;
else y = pointY2-pointY1;
Point2D result = new Point2D(x, y);
return result;
}
}
