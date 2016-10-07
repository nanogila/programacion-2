package controlDeAcceso;

public class Guard{
	WhiteList cards;
	public Guard(WhiteList cardList) {
	this.cards = cardList;
	}
public void addCard(Card aCard){
	cards.addCard(aCard);
}
public void removeCard(Card aCard){
	cards.removeCard(aCard);
}
protected boolean checkCard(Card aCard) {
return cards.checkCard(aCard);
}
}
