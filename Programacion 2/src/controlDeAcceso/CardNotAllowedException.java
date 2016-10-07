package controlDeAcceso;

public class CardNotAllowedException extends RuntimeException {
	public CardNotAllowedException(String message) {
		super(message);
	}
}
