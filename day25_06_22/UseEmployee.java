package day25_06_22;

public class UseEmployee {
	public static void main (String[]args) {
		Employee employee = new Employee();
		employee.employeeId=232232213l;
		employee.employeeName="ram";
		employee.dob="23/12/98";
		employee.mobileNo=9865657645l;
		Employee employee1 = new Employee();
		employee1.employeeId=232232214l;
		employee1.employeeName="maha";
		employee1.dob="03/10/75";
		employee1.mobileNo=9865453645l;
		System.out.println("+91 "+employee.mobileNo);
		System.out.println("+91 "+employee1.mobileNo);
	}

}
