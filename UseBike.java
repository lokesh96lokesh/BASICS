package loop5;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.brand="Pulser";
		bike1.price=180000;
		bike1.color="Black";
		
		Bike bike2=new Bike();
		bike2.brand="Yamaha";
		bike2.price=170000;
		bike2.color="Red";
		
		Bike bike3=new Bike();
		bike3.brand="BMW";
		bike3.price=200000;
		bike3.color="Blue";
		
		Bike[] bikes= {bike1,bike2,bike3};
		int max=0;
		//String maxBrand="";
		//String color1="";
		//Bike b4=null;
		//for(int i=0;i<bikes.length;i++) {
			//if(bikes[i].price>max) {
				//max=bikes[i].price;
				//maxBrand=bikes[i].brand;
				//color1=bikes[i].color;
				
				
			//}
			
		//}
		int min=bike1.price;
		Bike bike4=bike1;
		for(Bike b:bikes) {
			if(b.price<min) {
				min=b.price;
				bike4=b;
			}
		}
		System.out.println(bike4.brand+" "+bike4.price+" "+bike4.color);
		
	}

}
