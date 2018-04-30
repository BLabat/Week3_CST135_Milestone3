import java.util.Arrays;

public class Dispenser {
	private String [] productsArray = new String[100];
	private int numberOfProducts;
	
	public Dispenser() {
		int singleProductCapacity = 5;
		
		Product candy1 = new Candy();
		Product candy2 = new Candy("Heath Bar", "Mars Inc", .75);
		Candy candy3 = new Candy((Candy)candy2);
		Product chips1 = new Chips();
		Product chips2 = new Chips("Lays", "Frito-Lays", 1.25);
		Chips chips3 = new Chips((Chips)chips2);
		Product drinks1 = new Drinks();
		Product drinks2 = new Drinks("Sprite", "Coca-cola", 1.00);
		Drinks drinks3 = new Drinks((Drinks)drinks2);
		Product gum1= new Gum();
		Product gum2 = new Gum("Speermint", "Wrigley CO", .25);
		Gum gum3 = new Gum((Gum)gum2);
		
		for(int i = 0; i < singleProductCapacity; i++) {
			this.addProduct(candy1.toString());
			this.addProduct(candy2.toString());
			this.addProduct(candy3.toString());
			this.addProduct(chips1.toString());
			this.addProduct(chips2.toString());
			this.addProduct(chips3.toString());
			this.addProduct(drinks1.toString());
			this.addProduct(drinks2.toString());
			this.addProduct(drinks3.toString());
			this.addProduct(gum1.toString());
			this.addProduct(gum2.toString());
			this.addProduct(gum3.toString());
		}
	}
	public void displayProduct() {
		int x =1;
		for(int i = 0; i < getNumberOfProducts(); i++) {
			System.out.println(x++ + " - ");
			
		}
	}
	public void addProduct(String product) {
		productsArray[numberOfProducts] = product;
		numberOfProducts++;
	}
	public String[] getProducts() {
		return productsArray;
	}
	public int getNumberOfProducts() {
		return numberOfProducts;
	}
	public String toString() {
		return " Dispenser Products [Products =" +Arrays.toString(productsArray) + ", Number of Products = "
				+ numberOfProducts + "]";
	}
}
