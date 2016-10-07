package controlDeAcceso;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoorTests {

	@Test
	public void openDoorTest() {
		Card aCard = new Card(2111);
		WhiteList accessList = new WhiteList();
		Guard lider = new Guard(accessList);
		Door aDoor=new Door(accessList);
		lider.addCard(aCard);
		Boolean result = aDoor.open(aCard);
		assertTrue(result);
	}
	@Test (expected = CardNotAllowedException.class)
	public void openDoorFailTest() {
		Card aCard = new Card(2111);
		Card fakeCard = new Card(211);
		WhiteList accessList = new WhiteList();
		Guard lider = new Guard(accessList);
		Door aDoor=new Door(accessList);
		lider.addCard(aCard);
		aDoor.open(fakeCard);
	}
	@Test (expected = CardAlreadyAdded.class)
	public void addCardFailTest() {
		Card aCard = new Card(2111);
		Card fakeCard = new Card(2111);
		WhiteList accessList = new WhiteList();
		Guard lider = new Guard(accessList);
		lider.addCard(aCard);
		lider.addCard(fakeCard);

	}
	@Test
	public void addCardSuccessTest() {
		Card aCard = new Card(2111);
		Card fakeCard = new Card(211);
		WhiteList accessList = new WhiteList();
		Guard lider = new Guard(accessList);
		lider.addCard(aCard);
		lider.addCard(fakeCard);
		assertTrue(lider.checkCard(fakeCard) && lider.checkCard(aCard));
	}
	@Test
	public void removeCardSuccessTest() {
		Card aCard = new Card(2111);
		Card fakeCard = new Card(211);
		WhiteList accessList = new WhiteList();
		Guard lider = new Guard(accessList);
		lider.addCard(aCard);
		lider.addCard(fakeCard);
		lider.removeCard(aCard);
		lider.removeCard(fakeCard);
		assertTrue(!(lider.checkCard(fakeCard) && lider.checkCard(aCard)));
	}
	@Test (expected = CardNotFound.class)
	public void removeCardFailTest() {
		Card aCard = new Card(2111);
		WhiteList accessList = new WhiteList();
		Guard lider = new Guard(accessList);
		lider.addCard(aCard);
		lider.removeCard(aCard);
		lider.removeCard(aCard);
	}
}
