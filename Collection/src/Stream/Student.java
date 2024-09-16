package Stream;

public class Student {
	private String name;
	private int id;
	private char sec;
	private boolean isMale;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getSec() {
		return sec;
	}
	public void setSec(char sec) {
		this.sec = sec;
	}
	public boolean isGender() {
		return isMale;
	}
	public void setisMale(boolean isMale) {
		this.isMale = isMale;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int id, char sec, boolean isMale, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.sec = sec;
		this.isMale = isMale;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", sec=" + sec + ", gender=" + isMale + ", marks=" + marks
				+ "]";
	}
	
	

}
