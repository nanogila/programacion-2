package tp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DrinkTests {

	@Test
	public void testCashier() {
		Catalog catalog = new Catalog();
		catalog.addItem("Coca Cola", 20);
		catalog.addItem("Sprite", 40);		
		Cashier cajero = new Cashier(catalog);
		DrinkCart cart = new DrinkCart(4);
		Drink coca = new Drink("Coca Cola");
		Drink sprite = new Drink ("Sprite");
		cart.addToCart(coca);
		cart.addToCart(sprite);
		Invoice factura = cajero.factura(cart);
		int result = factura.totalCost(catalog);
		assertEquals(60, result);
	}
	@Test(expected = itemNoEstaEnElCatalogoException.class)
	public void testCartItemsException() throws itemNoEstaEnElCatalogoException {
		Catalog catalog = new Catalog();
		catalog.addItem("Coca Cola", 20);
		catalog.addItem("Sprite", 40);		
		Cashier cajero = new Cashier(catalog);
		DrinkCart cart = new DrinkCart(4);
		Drink coca = new Drink("Coca Cola");
		Drink spriteLight = new Drink ("Sprite Light");
		cart.addToCart(coca);
		cart.addToCart(spriteLight);
		Invoice factura = cajero.factura(cart);
		factura.itemCost(spriteLight, catalog);
	}
	@Test(expected = itemNoEstaEnElCatalogoException.class)
	public void testCartItemsExceptionName() throws itemNoEstaEnElCatalogoException {
		DrinkCart cart = new DrinkCart(4);
		Catalog catalog = new Catalog();
		catalog.addItem("Coca Cola", 20);
		catalog.addItem("Sprite", 40);		
		Cashier cajero = new Cashier(catalog);
		Drink coca = new Drink("Coca Cola");
		Drink spriteLight = new Drink ("Sprite Light");
		cart.addToCart(coca);
		cart.addToCart(spriteLight);
		Invoice factura = cajero.factura(cart);
		factura.itemNames(catalog);
	}
	@Test
	public void testCartItems() {
		DrinkCart cart = new DrinkCart(4);
		Drink coca = new Drink("Coca Cola");
		Drink sprite = new Drink ("Sprite");
		cart.addToCart(coca);
		cart.addToCart(sprite);
		Drink[] result = cart.getItems();
		String[] drinkNames = new String[4];
		for (int i=0; i<result.length; i++) {
			if (result[i]!=null) {
			drinkNames[i] = result[i].getName();
		}}
		String[] expected = new String[] {"Coca Cola", "Sprite", null, null};
		assertArrayEquals(expected, drinkNames);
		//assertEquals("Sprite", drinkNames[1]);
	}
	@Test
	public void testInvoiceItems() {
		DrinkCart cart = new DrinkCart(4);
		Catalog catalog = new Catalog();
		catalog.addItem("Coca Cola", 20);
		catalog.addItem("Sprite", 40);		
		Cashier cajero = new Cashier(catalog);
		Drink coca = new Drink("Coca Cola");
		Drink sprite = new Drink ("Sprite");
		cart.addToCart(coca);
		cart.addToCart(sprite);
		Invoice factura = cajero.factura(cart);
		String[] result = factura.itemNames(catalog);
		String[] expected = new String[] {"Coca Cola", "Sprite", null, null};
		assertArrayEquals(expected, result);
		//assertEquals("Sprite", drinkNames[1]);
	}
	public void testInvoiceItemCost() {
		Catalog catalog = new Catalog();
		catalog.addItem("Coca Cola", 20);
		catalog.addItem("Sprite", 40);		
		Cashier cajero = new Cashier(catalog);
		DrinkCart cart = new DrinkCart(4);
		Drink coca = new Drink("Coca Cola");
		Drink sprite = new Drink ("Sprite");
		cart.addToCart(coca);
		cart.addToCart(sprite);
		Invoice factura = cajero.factura(cart);
		int result = factura.itemCost(coca, catalog);
		assertEquals(40, result);
	}
	
}
