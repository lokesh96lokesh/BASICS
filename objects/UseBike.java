package objects;

public class UseBike {
	public static void main(String[]args) {
		Bike bike1 = new Bike();
		bike1.brand="yamaha";
		bike1.price=75000;
		bike1.taxAmount=7000;
		bike1.netprice=bike1.price+bike1.taxAmount;
		bike1.istubetype=true;
		System.out.println("Bike Brand : "+bike1.brand);
		System.out.println("Bike price : "+bike1.price);
		System.out.println("taxamount :"+bike1.taxAmount);
		System.out.println("netprice :"+bike1.netprice);
		System.out.println("istubetype :"+bike1.istubetype);
		
		
	}

}
