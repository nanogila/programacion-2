package tp2;

public class Triangle {
	private Segment segmentA;
	private Segment segmentB;
	private Segment segmentC;
	
public Triangle (Point2D aPointA, Point2D aPointB, Point2D aPointC) {
	Segment aSegmentA = new Segment (aPointA, aPointB);
	Segment aSegmentB = new Segment (aPointB, aPointC);
	Segment aSegmentC = new Segment (aPointC, aPointA);
	segmentA = aSegmentA;
	segmentB = aSegmentB;
	segmentC = aSegmentC;
}
/*	public double area(){
	
}*/
public double perimeter() {
	return segmentA.length()+segmentB.length()+segmentC.length();
}
public boolean isIsoceles() {
	Double lengthA=segmentA.length();
	Double lengthB=segmentB.length();
	Double lengthC=segmentC.length();
	System.out.println("lado A: "+lengthA);System.out.println("lado B: "+lengthB);System.out.println("lado C: "+lengthC);
	if(lengthA.equals(lengthB) || lengthB.equals(lengthC) || lengthC.equals(lengthA)) return true;
	return false;
}
public boolean isScalene() {
	if(!(segmentA.length() == segmentB.length() || segmentB.length() == segmentC.length() || segmentA.length() == segmentB.length())) return true;
	return false;
}
public boolean isEquilateral() {
	if(segmentA.length() == segmentB.length() && segmentB.length() == segmentC.length()) return true;
	return false;
}
}
