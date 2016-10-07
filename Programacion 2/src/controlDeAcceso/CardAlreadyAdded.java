package controlDeAcceso;

public class CardAlreadyAdded extends RuntimeException {
	public CardAlreadyAdded(String message) {
		super(message);
	}
}
