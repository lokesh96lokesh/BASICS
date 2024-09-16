package objects;

public class UseAirCooler {
	public static void main (String[]args) {
		AirCooler airCooler1 = new AirCooler ();
		airCooler1.brand="samsung";
		airCooler1.colour="black";
		airCooler1.price=75000;
		airCooler1.discountPercentage=12;
		airCooler1.taxPercentage=8;
		airCooler1.netPrice=airCooler1.price+(airCooler1.price*airCooler1.taxPercentage/100)-(airCooler1.price*airCooler1.discountPercentage/100);
		System.out.println("name :"+ airCooler1.brand);
		System.out.println("colour :"+airCooler1.colour);
		System.out.println("netprice :"+airCooler1.netPrice);

		
	}
}
