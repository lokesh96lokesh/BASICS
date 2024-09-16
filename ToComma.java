package day4;

public class ToComma {
	public static void main(String args[])
	{
		String name="Hello,Big,World";
		String[]result=name.split(",");
		int word=result.length;		
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(word);
	}

}
