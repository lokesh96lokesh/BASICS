package collection;

import java.util.ArrayList;

public class SampleProgram {
	public static void main(String[] args) {
		ArrayList<Integer> ages=new ArrayList<>();
		ages.add(23);
		ages.add(24);
		ages.add(27);
		ages.add(22);
		ages.add(23);
		ages.remove(3);
		ages.set(3, 10);
		//for(int i=0;i<ages.size();i++) {
			//System.out.println(ages.get(i));
		
		//}
		//for(Integer x:ages) {
			//System.out.println(x);
		//}
		ages.forEach(x->System.out.println(x));
		
	}

}
