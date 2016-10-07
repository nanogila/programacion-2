package tp5;

public class LinealFunction implements Function {
	double m;
	double b;
public LinealFunction (double m, double b) {
	this.m=m;
	this.b=b;
}
	@Override
	public double evaluate(double value) {
		// TODO Auto-generated method stub
		return m*value+b;
	}

}
