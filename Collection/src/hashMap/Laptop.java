package hashMap;

public class Laptop {
	private String brand;
	private int price;
	private String color;
	private boolean isSsd;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setIsSsd(boolean isSsd) {
		this.isSsd=isSsd;
	}
	public boolean getIsSsd() {
		return isSsd;
	}
	public Laptop(String brand,int price,String color,boolean isSsd) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isSsd=isSsd;
	}
	public String toString() {
		return brand+price+color+isSsd;
	}
	
	

}
