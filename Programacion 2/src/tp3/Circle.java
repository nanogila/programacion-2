package tp3;

public class Circle extends Figure {
private int radio;
	public Circle(int aRadio) {
	super();
	this.radio = aRadio;
}

	@Override
	public double perimeter() {
		return Math.PI*radio*2;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return radio*2;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int base() {
		// TODO Auto-generated method stub
		return 0;
	}

}
