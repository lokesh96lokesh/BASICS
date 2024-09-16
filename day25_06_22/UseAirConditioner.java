package day25_06_22;

public class UseAirConditioner {
	public static void main (String[]args) {
		AirConditioner airConditioner = new AirConditioner();
		airConditioner.brand="samsung";
		airConditioner.price=35000;
		airConditioner.noOfWings=4;
		airConditioner.isQuality=true;
		AirConditioner airConditioner1 = new AirConditioner();
		airConditioner1.brand="harier";
		airConditioner1.price=20000;
		airConditioner1.noOfWings=2;
		airConditioner1.isQuality=false;
		System.out.println(airConditioner.brand+" "+airConditioner.price+" "+airConditioner.noOfWings+" "+airConditioner.isQuality);
		System.out.println(airConditioner1.brand+" "+airConditioner1.price+" "+airConditioner1.noOfWings+" "+airConditioner1.isQuality);
	}

}
