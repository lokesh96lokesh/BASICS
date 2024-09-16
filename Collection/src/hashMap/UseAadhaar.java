package hashMap;
import java.util.*;

public class UseAadhaar {
	public static void main(String[] args) {
		Aadhaar a1=new Aadhaar("Suren",123456789009l,"Deva",23,true);
		Aadhaar a2=new Aadhaar("Arun",698765432112l,"Ajith",22,true);
		Aadhaar a3=new Aadhaar("Sara",123435678989l,"Muni",23,false);
		Aadhaar a4=new Aadhaar("Vino",213456789009l,"Murugan",20,false);
		Aadhaar a5=new Aadhaar("Navin",498907654321l,"Thang",23,true);
		
		HashMap<Long,Aadhaar> as=new HashMap<>();
		as.put(a1.getAdno(), a1);
		as.put(a2.getAdno(), a2);
		as.put(a3.getAdno(), a3);
		as.put(a4.getAdno(), a4);
		as.put(a5.getAdno(), a5);
		
		//String a=""; 
		
		//for(Long n:as.keySet()) {
			//a=a+as.get(n).getName();
		//}
		//System.out.println(a);
		//as.values().forEach(x-> System.out.println(x.getName()+" "+x.getFathersName()));
		Iterator<Aadhaar> x=as.values().iterator();
		while(x.hasNext()) {
			if(x.next().getIsMale()==false) {
			x.remove();
		}
		}
		System.out.println(as.values());
	}
		
	}


