package loop5;

public class UseBag {
	public static void main(String[] args) {
		Bag bag1=new Bag();
		bag1.brand="sky Bag";
		bag1.price=1200;
		bag1.type="schoolbag";
		bag1.color="Black";
		
		Bag bag2=new Bag();
	    bag2.brand="Buma";
	    bag2.price=1500;
	    bag2.type="TourBag";
	    bag2.color="Blue";
	    
	    Bag bag3=new Bag();
	    bag3.brand="Bata";
	    bag3.price=1600;
	    bag3.type="TravelBag";
	    bag3.color="red";
	    
	    Bag[] bags= {bag1,bag2,bag3};
	    //for(int i=0;i<bags.length;i++) {
	    	//if(bags[i].type.equalsIgnoreCase("Travelbag")) {
	    		//System.out.println(bags[i].brand+" "+bags[i].price+" "+bags[i].type+" "+bags[i].color);
	    	//}
	    for(Bag b:bags) {
	    	if(b.type.equalsIgnoreCase("Travelbag")) {
	    		System.out.println(b.brand+" "+b.price+" "+b.color);
	    	}
	    }
	}

}
