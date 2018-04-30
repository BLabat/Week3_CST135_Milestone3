
public class Driver {
	public static void main(String[]args) {
		String[] productsArray = new String[100];
		Dispenser dispenser = new Dispenser();
		dispenser.displayProduct();
		productsArray = dispenser.getProducts();
	
	Drinks drink1 = new Drinks("Coca-Cola", "Dr. Pepper", .75);
	Drinks drink2 = new Drinks("Coca-Cola", "Sprite", 1.00);
	
	Snack candy1 = new Candy("Mars INC.", "Snickers", 1.00);
	Snack candy2 = new Candy("Mars INC", "Heath Bar", .75);
	
	System.out.println("candy1 compared to candy2 =" + candy2.compareTo(candy1));
	System.out.println("drink1 compared to drink 2 =" + drink1.compareTo(drink2));
	}
}
