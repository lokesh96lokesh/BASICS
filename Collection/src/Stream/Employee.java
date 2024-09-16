package Stream;

public class Employee {
	private String name;
	private int id;
	private int age;
	private String disganation;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setAge(int age) {
		this.age=age;
		
	}
	public int getAge() {
		return age;
	}
	public void setDisganation(String disganation) {
		this.disganation=disganation;
	}
	public String getDisganation() {
		return disganation;
	}
	public Employee(String name,int id,int age,String disganation) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.disganation=disganation;
	}
	public String toString() {
		return name+id+age+disganation;
	}

}
