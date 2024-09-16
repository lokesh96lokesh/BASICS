package Stream;

public class Laptop {
	private String brand;
	private String model;
	private int price;
	private int ramSize;
	private boolean isSsd;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public boolean getIsSsd() {
		return isSsd;
	}
	public void setSsd(boolean isSsd) {
		this.isSsd = isSsd;
	}
	public Laptop(String brand, String model, int price, int ramSize, boolean isSsd) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.ramSize = ramSize;
		this.isSsd = isSsd;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", price=" + price + ", ramSize=" + ramSize + ", isSsd="
				+ isSsd + "]";
	}
	

}
