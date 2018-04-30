
abstract public class Product implements Comparable <Product> {
	
	private String name;
	private String brand;
	private double price;
	
	public Product() {
		name = "Doritos";
		brand = "Frito-Lay";
		price = 1.25;
	}
	
	public Product(String name, String brand, double price) {
		this.setName(name);
		this.setBrand(brand);
		this.setPrice(price);
	}
	public Product(Product copyProduct) {
		this.setName(copyProduct.getName());
		this.setBrand(copyProduct.getBrand());
		this.setPrice(copyProduct.getPrice());
	}
	public String getName() {
		return this.name;
	}
	public String getBrand() {
		return this.brand;
	}
	public double getPrice() {
		return this.price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "\n"
		+ getName()
		+"\nPrice; " + getPrice()
		+"\nBrand: " + getBrand();
		
	}
}
