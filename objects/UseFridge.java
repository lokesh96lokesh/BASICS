package objects;

public class UseFridge {
	public static void main(String[]args) {
		Fridge fridge1 = new Fridge();
		fridge1.brand ="samsung";
		fridge1.colour="blue";
		fridge1.price=75000;
		fridge1.discountAmount=3400;
		fridge1.netPrice=fridge1.price-fridge1.discountAmount;
		fridge1.isEcoFriendly=true;
		System.out.println("name ;"+fridge1.brand);
		System.out.println("colour ;"+fridge1.colour);
		System.out.println("netprice ;"+fridge1.netPrice);
		
		
	}
}