package samples;

public class Student {
	private String name;
	private int age;
	private boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Student(String name, int age, boolean isMale) {
		super();
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isMale=" + isMale + "]";
	}
	
	
	

}
