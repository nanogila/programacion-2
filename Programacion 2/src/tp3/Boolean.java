package tp3;

public class Boolean {
	boolean a;
	boolean b;
	public Boolean (boolean first, boolean second) {
		a = first;
		b = second;
	}
public boolean and () {
	if (a && b) return true;
	return false;
}
public boolean or () {
	if (a || b) return true;
	return false;
}
public boolean not () {
	if (!a) return true;
	return false;
}
}
