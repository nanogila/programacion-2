package tp2;

import java.util.*;

public class Catalog {
	HashMap<String, Integer> catalog;
public Catalog() {
	catalog = new HashMap<String, Integer>();
}
public void addItem(String aName, int aPrice) {
	catalog.put(aName, aPrice);
}
public void removeItem(String aName) {
	catalog.remove(aName);
}
public int getPrice(String aProduct) throws itemNoEstaEnElCatalogoException {
	if (!catalog.containsKey(aProduct))throw new itemNoEstaEnElCatalogoException("el item '"+aProduct+ "' no esta en el catalogo, PUTO");
	else return catalog.get(aProduct);
	
}
}
