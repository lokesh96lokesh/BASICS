package loop5;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="innova";
		car1.price=1800000;
		car1.color="Black";
		
		Car car2=new Car();
		car2.brand="BMW";
		car2.price=1700000;
		car2.color="Red";
		
		Car car3=new Car();
		car3.brand="AUDI";
		car3.price=2000000;
		car3.color="White";
		
		Car[] cars= {car1,car2,car3};
		//for(int i=0;i<cars.length;i++) {
			//if(cars[i].brand.equalsIgnoreCase("innova")) {
				//System.out.println(cars[i].brand+" "+cars[i].price+" "+cars[i].color+" TaxFree");
			//}
			//else {
				//System.out.println(cars[i].brand+" "+cars[i].price+"  "+cars[i].color+(cars[i].price+10000));
			//}
		//}
		for(Car c:cars) {
			if(c.brand.equalsIgnoreCase("Innova")) {
				System.out.println(c.brand+" "+c.price+" "+c.color+" "+"TaxFree");
			}
			else {
				System.out.println(c.brand+" "+c.price+" "+c.color+" "+(c.price+10000));
			}
		}
	}

}
