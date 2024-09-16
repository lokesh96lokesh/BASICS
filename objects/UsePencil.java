package objects;

public class UsePencil {
	public static void main (String[]args) {
				Pencil pencil1 = new Pencil();
				pencil1.brand="absara";
				pencil1.price=30;
				pencil1.colour="black";
				Pencil pencil2 =new Pencil();
				pencil2.brand="natraj";
				pencil2.price=35;
				pencil2.colour="black";
				System.out.println(pencil1.brand);
				System.out.println(pencil1.price);
				System.out.println(pencil1.colour);
				System.out.println(pencil2.brand);
				System.out.println(pencil2.price);
				System.out.println(pencil2.colour);
		}

}
