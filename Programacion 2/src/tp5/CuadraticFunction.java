package tp5;

public class CuadraticFunction implements Function {
double a;
double b;
double c;
CuadraticFunction(double a, double b, double c){
	this.a=a;
	this.b=b;
	this.c=c;
}
	@Override
	public double evaluate(double value) {
		// TODO Auto-generated method stub
		return a*Math.pow(value, 2)+b*value+c;
	}

}
