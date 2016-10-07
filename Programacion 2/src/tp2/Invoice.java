package tp2;

public class Invoice {
	DrinkCart cart;
public Invoice(DrinkCart aCart) {
	cart = aCart;
}
public int totalCost(Catalog aCatalog) {
	Drink[] items = cart.getItems();
	int cost = 0;
	for (int i=0; i<items.length; i++) {
		if (items[i]!=null) {
		cost += itemCost(items[i], aCatalog);
	}}
	return cost;
}
public int itemCost(Drink aDrink, Catalog aCatalog) {
int cost = aCatalog.getPrice(aDrink.getName());
	return cost;
}
public String[] itemNames(Catalog aCatalog){
	Drink[] items = cart.getItems();
	for (Drink i : items) {
		if (i != null)		aCatalog.getPrice(i.getName());
	}
	String[] names = new String[items.length];
	for (int i=0; i<items.length; i++) {
		if (items[i]!=null) {
		names[i]= items[i].getName();
	}}
	return names;
}
}
