package day4;

public class UseMobile {
	public static void main(String args[]) {
		Mobile mobile1=new Mobile();
		mobile1.brand="POCO";
		mobile1.price=15000;
		mobile1.colour="Black";
		mobile1.isTouchScreen=true;
		mobile1.modelNo=5;
		
		Mobile mobile2=new Mobile();
		mobile2.brand="VIVO";
		mobile2.price=14000;
		mobile2.colour="Blue";
		mobile2.isTouchScreen=false;
		mobile2.modelNo=4;
		
		String result=mobile1.brand.toLowerCase();
		String result1=mobile2.brand.toLowerCase();
		System.out.println(result);
		System.out.println(result1);
		
		String output=mobile1.brand.concat(mobile2.brand);
		System.out.println(output);
		
		int len=output.length();
		System.out.println(len);
		
		char firstBrand=mobile1.brand.charAt(0);
		System.out.println(firstBrand);
		
		char secondBrand=mobile2.brand.charAt(3);
		System.out.println(secondBrand);
		
		String center=mobile1.brand.substring(1,3);
		System.out.println(center);
		
		
		
		
		
	}

}
