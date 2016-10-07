package tp21;

public class Triangle {
	private final Segment[] side = new Segment[3];
	public Triangle(Point2D aPoint1, Point2D aPoint2, Point2D aPoint3){
    	side[0]= new Segment(aPoint1, aPoint2);
    	side[1]= new Segment(aPoint2, aPoint3);
    	side[2]= new Segment(aPoint3, aPoint1);
    }
	public double area() {
    	double semiperimeter=perimeter()/2;
    	double area = Math.sqrt(semiperimeter*(semiperimeter-side[0].length())*(semiperimeter-side[1].length())*(semiperimeter-side[2].length()));
    return area;
	}
    public double perimeter() {
    	return side[0].length()+side[1].length()+side[2].length();
    }
    public boolean isIsoceles(){
    	if (side[0].length()==side[1].length() || side[0].length()==side[2].length() || side[1].length()==side[2].length()) {
    		return true;
    	}
    	return false;
    }
    public boolean isScalene(){
    	if (side[0].length()!=side[1].length() && side[0].length()!=side[2].length() && side[1].length()!=side[2].length()) {
    		return true;
    	}
    	return false;
    }
    
    public boolean isEquilateral(){
    	if (side[0].length()==side[1].length() && side[0].length()==side[2].length() && side[1].length()==side[2].length()) {
    		return true;
    	}
    	return false;
    }
}
