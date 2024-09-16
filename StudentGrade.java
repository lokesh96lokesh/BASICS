package elseIfLadder;

public class StudentGrade {
	public static void main(String[]args) {
	int markPercentage=20;
	if (markPercentage>90&&markPercentage<=100) {
		System.out.println(" 1st class");
	}
	else if(markPercentage>80&&markPercentage<=90) {
		System.out.println("2nd class");
	}
	else if (markPercentage<50){
		System.out.println("3rd class");
		
	}
	
	}
}
