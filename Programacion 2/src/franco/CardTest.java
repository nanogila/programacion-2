package franco;

import org.junit.*;
import java.util.*;


public class CardTest {

    @Test
    public void test00(){
        Map<String, Integer> aCard = new HashMap<>();
        aCard.putIfAbsent("Bill", 12345678);
        Card card = new Card(aCard);

        Assert.assertTrue(card.dni("Bill") == 12345678);
    }

    @Test (expected = PersonNotAdmittedException.class)
    public void test01(){
        Map<String, Integer> aCard = new HashMap<>();
        aCard.putIfAbsent("Bill", 12345678);
        Card card = new Card(aCard);

        card.dni("Steve");
    }

    @Test
    public void test02() {
        Map<String, Integer> aCard = new HashMap<>();
        aCard.putIfAbsent("Bill", 12345678);
        Card card = new Card(aCard);
        card.openGate();
    }

    @Test (expected = AccessDeniedException.class)
    public void test03() {
        Map<String, Integer> aCard = new HashMap<>();
        aCard.putIfAbsent("Bill", 12345678);
        Card card = new Card(aCard);
        card.denyAccess();
        card.openGate();
    }

    @Test
    public void test04() {
        Map<String, Integer> aCard = new HashMap<>();
        aCard.putIfAbsent("Bill", 12345678);
        Card card = new Card(aCard);
        card.accessStatus();
    }

    @Test
    public void test05() {
        Map<String, Integer> aCard = new HashMap<>();
        aCard.putIfAbsent("Bill", 12345678);
        Card card = new Card(aCard);
        card.ownerInfo();
    }
}