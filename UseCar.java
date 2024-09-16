package lms;

public class UseCar {
	public static void main(String[]args) {
		int value2=Integer.parseInt(args[2]);
		Car c1=new Car();
		c1.brand=args[0];
		c1.color=args[1];
		c1.price=value2;
		System.out.println(c1.brand.toLowerCase()+" "+c1.color.toUpperCase()+" "+c1.price);
		System.out.println(c1.brand+" "+c1.color+" "+c1.price);
	}

}
 class Car{
	 String brand;
	 String color;
	 int price;
 }