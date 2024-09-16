package lms;

public class UseDetials {
	public static void main(String[]args) {
		String[]detail=args[0].split(",");
		String[]detail1=args[1].split(",");
		int convert=Integer.parseInt(detail[1]);
		int convert1=Integer.parseInt(detail1[1]);
		Detial d1=new Detial();
		d1.name=detail[0];
		d1.age=convert;
		d1.mail=detail[2];
		Detial d2=new Detial();
		d2.name=detail1[0];
		d2.age=convert1;
		d2.mail=detail1[2];
		System.out.println(d1.name+" "+d1.age+" "+d1.mail);
		System.out.println(d2.name+" "+d2.age+" "+d2.mail);
		
	}

}

class Detial {
	String name;
	int age;
	String mail;
}