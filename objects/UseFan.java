package objects;

public class UseFan {
	public static void main(String[]args) {
		Fan fan =new Fan();
		fan.brand="usha";
		fan.price=2500;
		fan.taxPercentage=2;
		fan.discountPercentage=20;
		fan.discountAmount=fan.price*fan.discountPercentage/100;
		fan.taxAmount=fan.price*fan.taxPercentage/100;
		fan.netPrice=fan.price+fan.taxAmount-fan.discountAmount;
		fan.netPrice2=fan.price+(fan.price*fan.taxPercentage/100)-(fan.price*fan.discountPercentage/100);
		System.out.println("Net Price Rs:"+fan.netPrice);
		System.out.println("Net Price2 Rs:"+fan.netPrice2);
	}
}
