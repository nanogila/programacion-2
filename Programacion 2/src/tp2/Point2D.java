package tp2;

public class Point2D {
	private int pointX;
	private int pointY;
	public Point2D(int aPointX, int aPointY) {
		pointX = aPointX;
		pointY = aPointY;
	}
public double getDistance(Point2D point){
	double distance = Math.sqrt(Math.pow(point.pointX-pointX, 2)+Math.pow(point.pointY-pointY, 2));
	System.out.println("distancia: "+distance);
	return distance;
}
public Point2D add (Point2D point){
	Point2D addedPoints = new Point2D(pointX+point.pointX, pointY+point.pointY);
	return addedPoints;
}
public int getX(){
	return pointX;
}
public int getY(){
	return pointY;
}
}
