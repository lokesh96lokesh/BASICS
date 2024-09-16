package objects;

public class UseCar {
	public static void main (String[]args) {
		Car car1 = new Car();
		car1.brand="skoda";
		car1.colour="black";
		car1.price=75000;
		car1.taxPercentage=12;
		car1.netPrice=car1.price*(car1.price*car1.taxPercentage/100);
		car1.isAirBag=true;
		System.out.println("name :"+car1.brand);
		System.out.println("colour :"+car1.colour);
		System.out.println("netprice :"+car1.netPrice);
	}

}
