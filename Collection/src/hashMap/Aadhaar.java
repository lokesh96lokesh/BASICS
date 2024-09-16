package hashMap;

public class Aadhaar {
	private String name;
	private long adno;
	private String fathersName;
	private int age;
	private boolean isMale;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAdno(long adno) {
		this.adno=adno;
	}
	public long getAdno() {
		return adno;
	}
	public void setFathersName(String fathersName) {
		this.fathersName=fathersName;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Aadhaar(String name,long adno,String fathersName,int age,boolean isMale) {
		this.name=name;
		this.adno=adno;
		this.fathersName=fathersName;
		this.age=age;
		this.isMale=isMale;
	}
	public String toString() {
		return name+fathersName+age+isMale;
	}
	

}
