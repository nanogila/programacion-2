package franco;

import java.util.*;

public class Card {

    private Map<String, Integer> card;
    private boolean access;

    public Card(Map<String, Integer> card) {
        this.card = card;
        access = true;
    }

    public Integer dni(String name) throws PersonNotAdmittedException{
        if (card.containsKey(name)) 
        	return card.get(name);
        	throw new PersonNotAdmittedException(name + " is not admitted");
        
    }

    public void denyAccess() {
        access = false;
        System.out.println("Access denied");
    }

    public void enableAccess() {
        access = true;
        System.out.println("Access granted");
    }

    public boolean accessStatus() {
        if(access) {
            System.out.println("Access is enabled");
        } else {
            System.out.println("Access is denied");
        }
        return access;
    }

    public boolean openGate() throws AccessDeniedException {
        if(access) {
            return true;
        } else {
            throw new AccessDeniedException("Access denied");
        }
    }

    public void ownerInfo() {
        System.out.println(card);
    }
}