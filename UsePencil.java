package loop5;

public class UsePencil {
	public static void main(String[] args) {
		Pencil pencil1=new Pencil();
		pencil1.brand="Absara";
		pencil1.price=20;
		pencil1.color="Black";
		
		Pencil pencil2=new Pencil();
		pencil2.brand="Nataraj";
		pencil2.price=15;
		pencil2.color="Red";
		
		Pencil pencil3=new Pencil();
		pencil3.brand="Cello";
		pencil3.price=30;
		pencil3.color="Blue";
		
		Pencil[] pencils= {pencil1,pencil2,pencil3};
		int max=0;
		String brand1="";
		for(int i=0;i<pencils.length;i++) {
			
			if(pencils[i].price>max) {
				max=pencils[i].price;
				brand1=pencils[i].brand;
				
			}
			
		}
		System.out.println(brand1);
		if(brand1.contains("a") || brand1.contains("e") || brand1.contains("i") || brand1.contains("o") || brand1.contains("u")) {
			System.out.println(brand1+" contains vowels");
		}
		
		
	}

}
