package loop44;

public class CountUpper {
	public static void main(String[] args) {
		String[] name= {"Kamesh","SUREN","ARUN","suresh"};
		int count=0;
		for(int i=0;i<name.length;i++) {
			if(name[i]==name[i].toUpperCase()) {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
