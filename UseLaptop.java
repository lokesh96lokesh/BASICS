package loop5;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap1=new Laptop();
		lap1.brand="HP";
		lap1.verson="vd123";
		lap1.isTouchScreen=true;
		
		Laptop lap2=new Laptop();
		lap2.brand="LENOVO";
		lap2.verson="WP123";
		lap2.isTouchScreen=false;
		
		Laptop lap3=new Laptop();
		lap3.brand="DELL";
		lap3.verson="WSP345";
		lap3.isTouchScreen=false;
		
		Laptop[] laps= {lap1,lap2,lap3};
		for(int i=0;i<laps.length;i++) {
			if(laps[i].isTouchScreen==true) {
				
				System.out.println(laps[i].brand+" "+laps[i].verson+" "+laps[i].isTouchScreen);
			}
		}
	}

}
