package day25_06_22;

public class UseMarker {
	public static void main(String[]args) {
		Marker marker1 =new Marker();
		marker1.price=20;
		marker1.colour="black";
		marker1.weight=0.01f;
		marker1.isQuality=true;
		Marker marker2 =new Marker();
		marker2.price=15;
		marker2.colour="blue";
		marker2.weight=0.02f;
		marker2.isQuality=false;
		Marker marker3 =new Marker();
		marker3.price=25;
		marker3.colour="red";
		marker3.weight=0.14f;
		marker3.isQuality=true;
		System.out.println("marker1:"+marker1.price+" "+marker1.colour+" "+marker1.weight+" "+marker1.isQuality);
		System.out.println("marker2:"+marker2.price+" "+marker2.colour+" "+marker2.weight+" "+marker2.isQuality);
		System.out.println("marker3:"+marker3.price+" "+marker3.colour+" "+marker3.weight+" "+marker3.isQuality);


	}

}
