package loop5;

public class UseBottle {
	public static void main(String[] args) {
		Bottle bottle1=new Bottle();
		bottle1.brand="TRU";
		bottle1.type="Plastic";
		bottle1.price=60;
		
		Bottle bottle2=new Bottle();
		bottle2.brand="SIRU";
		bottle2.type="Silver";
		bottle2.price=80;
		
		Bottle bottle3=new Bottle();
		bottle3.brand="ARU";
		bottle3.type="Glass";
		bottle3.price=60;
		
		Bottle[] bottles= {bottle1,bottle2,bottle3};
		int max=0;
		Bottle b=null;
		//for(int i=0;i<bottles.length;i++) {
			//if(bottles[i].brand.length()>max) {
				//max=bottles[i].brand.length();
				//b=bottles[i];
				
			//}
			//}
		for(int i=0;i<bottles.length;i++) {
			if(bottles[i].price>max) {
				max=bottles[i].price;
				b=bottles[i];
		
			}
			
		}
		System.out.println(b.brand+" "+b.type+" "+(b.price+(b.price*5/100)));
		
		
		
		//System.out.println(b.brand+" "+b.type+" "+b.price);
		}
}
