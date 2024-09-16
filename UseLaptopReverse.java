package for2and3;

public class UseLaptopReverse {
		public static void main(String[] args) {
			Laptop lap1=new Laptop();
			lap1.brand="acer";
			lap1.price=16000;
			lap1.modleNum="qwe";
			lap1.isTouchScreem=true;
			Laptop lap2=new Laptop();
			lap2.brand="apple";
			lap2.price=78000;
			lap2.modleNum="fsd";
			lap2.isTouchScreem=true;
			Laptop lap3=new Laptop();
			lap3.brand="dell";
			lap3.price=16740;
			lap3.modleNum="ada";
			lap3.isTouchScreem=false;
			Laptop[] laptops=new Laptop[3];
			laptops[0]=lap1;
			laptops[1]=lap2;
			laptops[2]=lap3;
			for(int i=laptops.length-1;i>=0;i--) {
				System.out.println(laptops[i].brand.toUpperCase()+" "+laptops[i].price+" "+laptops[i].modleNum.toUpperCase()+" "+laptops[i].isTouchScreem);
			}
		}

	}

