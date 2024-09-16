package collection;

public class Student {
	private String name;
	private String gender;
	private int age;
	private  int fees;
	private String course;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getgender() {
		return gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setFees(int fees) {
		this.fees=fees;
	}
	public int getfees() {
		return fees;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public String getcourse() {
		return course;
	}
	public Student(String name,String gender,int age,int fees,String course) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.fees=fees;
		this.course=course;
	}
	public String toString() {
		return name+gender+age+fees+course;
	}
	

}
