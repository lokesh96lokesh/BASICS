package hashMap;

public class Phant {
	private String brand;
	private int price;
	private boolean isCotton;
	private String color;
	
	public String getBrand() {
		return  brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsCotton() {
		return isCotton;
	}
	public String getColor() {
		return color;
	}
	
	public Phant(String brand,int price,boolean isCotton,String color) {
		this.brand=brand;
		this.price=price;
		this.isCotton=isCotton;
		this.color=color;
	}
	public String toString() {
		return brand+price+isCotton+color;
	}

}
