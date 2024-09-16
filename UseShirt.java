package loop5;

public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt1=new Shirt();
		shirt1.price=1200;
		shirt1.brand="JungleJean";
		shirt1.isChecked=false;
		
		Shirt shirt2=new Shirt();
		shirt2.price=1300;
		shirt2.brand="Cotton";
		shirt2.isChecked=true;
		
		Shirt shirt3=new Shirt();
		shirt3.price=1400;
		shirt3.brand="Lenon";
		shirt3.isChecked=false;
		
		Shirt[] shirts= {shirt1,shirt2,shirt3};
		int min=shirts[0].price;
		Shirt s=shirt1;
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].price<min) {
				min=shirts[i].price;
				s=shirts[i];
			}
		}
	System.out.println(s.price+" "+s.brand+" "+s.isChecked);
		
	}

}
