package loop44;

public class MinString {
	public static void main(String[] args) {
		String[] names= {"sanjeevi","Suren","Loki","Kamesh"};
		int min=names[0].length();
		int index=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<min) {
				min=names[i].length();
				index=i;
				
			}
			
		}
		System.out.println(names[index]);
	}

}
