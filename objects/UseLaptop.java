package objects;

public class UseLaptop {
	public static void main (String[]args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="acer";
		laptop1.price=34000;
		laptop1.ram="4GB";
		laptop1.memory="1TB";
		Laptop laptop2=new Laptop();
		laptop2.brand="HP";
		laptop2.price=45000;
		laptop2.ram="8GB";
		laptop2.memory="2TB";
		Laptop laptop3=new Laptop();
		laptop3.brand="asus";
		laptop3.price=25000;
		laptop3.ram="16GB";
		laptop3.memory="6TB";
		System.out.println(laptop1.brand+" "+laptop1.price+" "+laptop1.ram+" "+laptop1.memory);
		System.out.println(laptop2.brand+" "+laptop2.price+" "+laptop2.ram+" "+laptop2.memory);
		System.out.println(laptop3.brand+" "+laptop3.price+" "+laptop3.ram+" "+laptop3.memory);
	}

}
