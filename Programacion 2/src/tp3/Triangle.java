package tp3;

public class Triangle extends Figure{
	int height;
	int base;
	public Triangle (int aBase, int aHeight) {
		height= aHeight;
		base = aBase;
	}
	@Override
	public double perimeter() {
		return height + base + diagonal();
	}

	@Override
	public double area() {
		return base*height/2;
	}

	@Override
	public double diagonal() {
		
		return Math.sqrt(Math.pow(height, 2)+Math.pow(base, 2));
	}

	@Override
	public int height() {
		
		return height;
	}

	@Override
	public int base() {
		return base;
	}

}
