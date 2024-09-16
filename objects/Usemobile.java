package objects;

public class Usemobile {
	public static void main(String[]args) {
	Mobile mobile1 =new Mobile();
	mobile1.brand="samsung";
	mobile1.price= 10000;
	mobile1.colour="black";
	mobile1.isWaterproof=true;
	Mobile mobile2 =new Mobile();
	mobile2.brand="apple";
	mobile2.price= 70000;
	mobile2.colour="blue";
	mobile2.isWaterproof=false;
	Mobile mobile3 =new Mobile();
	mobile3.brand="vivo";
	mobile3.price= 20000;
	mobile3.colour="white";
	mobile3.isWaterproof=true;
	System.out.println(mobile1.brand+" "+mobile1.price+" "+mobile1.colour+" "+mobile1.isWaterproof);
	System.out.println(mobile2.brand+" "+mobile2.price+" "+mobile2.colour+" "+mobile2.isWaterproof);
	System.out.println(mobile3.brand+" "+mobile3.price+" "+mobile3.colour+" "+mobile3.isWaterproof);
	

}
}
