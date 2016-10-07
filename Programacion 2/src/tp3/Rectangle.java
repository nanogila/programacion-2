package tp3;

public class Rectangle extends Figure {
int height;
int base;
public Rectangle (int aBase, int aHeight) {
	height= aHeight;
	base = aBase;
}
	@Override
	public double perimeter() {

		return (height*2)+(base*2);
	}

	@Override
	public double area() {
		
		return base*height;
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
