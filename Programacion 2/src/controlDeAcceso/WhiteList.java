package controlDeAcceso;

import java.util.*;

public class WhiteList {
	List<Card> allowedCards;
public WhiteList() {
	this.allowedCards = new ArrayList<Card>();
}
protected void addCard(Card aCard) throws CardAlreadyAdded{
	if(this.checkCard(aCard)) throw new CardAlreadyAdded("esta tarjeta ya esta habilitada");
	else
	allowedCards.add(aCard);
}
protected void removeCard(Card aCard) throws CardNotFound{
	if(this.checkCard(aCard)) 	allowedCards.remove(aCard);
	else
	throw new CardNotFound("la tarjeta no se encuentra en el sistema");

}
protected boolean checkCard(Card aCard) {
	int id = aCard.id;
	for (int i = 0; i < allowedCards.size(); i++) {
		if (allowedCards.get(i).id == id) return true;
	}
	return false;
}
}
