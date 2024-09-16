package loop5;

public class UseBus {
	public static void main(String[] args) {
		Bus bus1=new Bus();
		bus1.Regno="KA18245";
		bus1.color="Black";
		bus1.noOfSeats=80;
		
		Bus bus2=new Bus();
		bus2.Regno="TN8643";
		bus2.color="Blue";
		bus2.noOfSeats=90;
		
		Bus bus3=new Bus();
		bus3.Regno="KL63TN5463";
		bus3.color="Black";
		bus3.noOfSeats=70;
		
		Bus bus4=new Bus();
		bus4.Regno="TN5347";
		bus4.color="red";
		bus4.noOfSeats=100;
		
		Bus[] buss= {bus1,bus2,bus3,bus4};
		for(int i=0;i<buss.length;i++) {
			if(buss[i].Regno.startsWith("TN")) {
				System.out.println(buss[i].Regno+" "+buss[i].color+" "+buss[i].noOfSeats);
			}
		}
		//for(int i=0;i<buss.length;i++) {
			//if(buss[i].Regno%2==0) {
				//System.out.println(buss[i].Regno+" "+buss[i].color+" "+buss[i].noOfSeats);
			//}
			
		//}
		
	}

}
