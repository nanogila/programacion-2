package tp2;

public class DrinkCart {
Drink[] content;
int items;
DrinkCart (int size){
	content = new Drink[size];
	items = 0;
}
void addToCart(Drink aDrink){
	if (items<content.length) {
		content[items] = aDrink;
		items++;
	}
}
public Drink[] getItems() {
	return content;
}
}
