package lms;
public class UseFan {
	public static void main(String[]args) {
		String[]rec=args[0].split(",");
		String[] rec1=args[1].split(",");
		Fan f1 =new Fan();
		f1.brand=rec[0];
		f1.price=Integer.parseInt(rec[1]);
		f1.color=rec[2];
		Fan f2 =new Fan();
		f2.brand=rec1[0];
		f2.price=Integer.parseInt(rec1[1]);
		f2.color=rec1[2];
		System.out.println("Brand :"+f1.brand+" "+f2.brand);
		System.out.println("price :"+f1.price+" "+f2.price);
		System.out.println("color :"+f1.color+" "+f2.color);
	}
}
class Fan{
	String brand;
	int price;
	String color;
}