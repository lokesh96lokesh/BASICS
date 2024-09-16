package day3Qs;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop lap1=new Laptop();
		lap1.brand="Dell";
		lap1.price=13000;
		lap1.color="blue";
		lap1.isWarranty=true;
		String name=lap1.brand.toUpperCase();
		int length=lap1.brand.length();
		boolean result=lap1.brand.contains("D");
		char[]last=lap1.brand.toCharArray();
		String name2=lap1.color.toLowerCase();
		System.out.println(name);
		System.out.println(name2);
		System.out.println(length);
		System.out.println(last[3]);
		System.out.println(result);


		
		
	}

}
