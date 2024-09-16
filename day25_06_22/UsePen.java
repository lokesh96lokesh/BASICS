package day25_06_22;

public class UsePen {
	public static void main (String[]args) {
		Pen pen1= new Pen();
		pen1.brand="cello";
		pen1.price=20;
		pen1.isBlueColour=true;
		pen1.tipWidth="0.01mg";
		Pen pen2= new Pen();
		pen2.brand="natraj";
		pen2.price=25;
		pen2.isBlueColour=false;
		pen2.tipWidth="1mg";
		Pen pen3= new Pen();
		pen3.brand="hero";
		pen3.price=30;
		pen3.isBlueColour=true;
		pen3.tipWidth="1mg";
		System.out.println(pen1.brand+" "+pen1.price+" "+pen1.isBlueColour+" "+pen1.tipWidth);
		System.out.println(pen2.brand+" "+pen2.price+" "+pen2.isBlueColour+" "+pen2.tipWidth);
		System.out.println(pen3.brand+" "+pen3.price+" "+pen3.isBlueColour+" "+pen3.tipWidth);
	}

}
