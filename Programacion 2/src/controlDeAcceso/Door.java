package controlDeAcceso;

public class Door {
WhiteList cards;
public Door(WhiteList cardList) {
this.cards = cardList;
}
public boolean open (Card aCard) throws CardNotAllowedException{
	if (!cards.checkCard(aCard)) throw new CardNotAllowedException("ERROR - TARJETA INVALIDA");
	else return true;
}
}
