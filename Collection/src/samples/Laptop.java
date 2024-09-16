package samples;

public class Laptop {
	private String brand;
	private int price;
	private int ram;
	private boolean isSsd;
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public boolean getIsSsd() {
		return isSsd;
	}
	public void setIsSsd(boolean isSsd) {
		this.isSsd = isSsd;
	}
	public Laptop(String brand, int price, int ram, boolean isSsd) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.isSsd = isSsd;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + ", isSsd=" + isSsd + "]";
	}
	
	

}
