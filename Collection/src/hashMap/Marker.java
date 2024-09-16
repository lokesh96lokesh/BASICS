package hashMap;

public class Marker {
	private String brand;
	private int price;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	
	public Marker(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return brand+price+color;
	}

}
