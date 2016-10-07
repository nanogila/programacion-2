package tp2;

public class Cashier {
	Catalog priceList;
	public Cashier(Catalog aCatalog) {
		priceList = aCatalog;
	}
public int cost(DrinkCart cart) {
	Drink[] items = cart.getItems();
	int cost = 0;
	for (int i=0; i<items.length; i++) {
		if (items[i]!=null) {
		cost += priceList.getPrice(items[i].getName());
	}}
	return cost;
}
public Invoice factura(DrinkCart carrito) {
 Invoice factura = new Invoice(carrito);
 return factura;
}

}
