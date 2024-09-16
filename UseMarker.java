package for2and3;

public class UseMarker {
	public static void main(String[] args) {
		Marker marker1=new Marker();
		Marker marker2=new Marker();
		Marker marker3=new Marker();
		marker1.price=20;
		marker1.size=2;
		marker1.color="black";
		marker1.isRefillable=true;
		marker2.price=25;
		marker2.size=3;
		marker2.color="blue";
		marker2.isRefillable=true;
		marker3.price=27;
		marker3.size=1;
		marker3.color="red";
		marker3.isRefillable=false;
		Marker[] markers= {marker1,marker2,marker3};
		for(int i=0;i<markers.length;i++) {
			System.out.println(markers[i].price+","+markers[i].size+","+markers[i].color+","+markers[i].isRefillable);
		}
		for(int i=markers.length-1;i>=0;i--) {
			System.out.println(markers[i].price+","+markers[i].size+","+markers[i].color+","+markers[i].isRefillable);
		}
	}
}
