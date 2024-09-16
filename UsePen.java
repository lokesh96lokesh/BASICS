package loop5;

public class UsePen {
	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.brand="Cello";
		pen1.refillcolor="Black";
		pen1.price=50;
		
		Pen pen2=new Pen();
		pen2.brand="Nataraj";
		pen2.refillcolor="Blue";
		pen2.price=60;
		
		Pen pen3=new Pen();
		pen3.brand="Park";
		pen3.refillcolor="Green";
		pen3.price=30;
		
		Pen pen4=new Pen();
		pen4.brand="Ink";
		pen4.refillcolor="Blue";
		pen4.price=40;
		
		Pen[] pens= {pen1,pen2,pen3,pen4};
		int count=0;
		for(int i=0;i<pens.length;i++) {
			if(pens[i].refillcolor.equals("Blue")) {
				count=count+1;
				
			}
			
			
		}
		System.out.println(count);
		
	}

}
