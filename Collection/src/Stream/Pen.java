package Stream;

public class Pen {
	private String brand;
	private int price;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Pen(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	

}
