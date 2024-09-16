package day3Qs;

public class SplitNew {
	public static void main(String[]args) {
		String name="Java,PYTHON,C++";
		String[] seperation=name.split(",");
		String caps=name.toUpperCase();
		System.out.println(caps);
		System.out.println(seperation[0]);
		System.out.println(seperation[1]);
		System.out.println(seperation[2]);
		System.out.println(seperation[0]);
		System.out.println(name.length());

		
	}

}
