package elseIfLadder;

public class FindBiggestNumber {
	public static void main(String[]args) {
	int firstnum=76;
	int secondnum=35;
	int thirdnum=45;
	if (firstnum>secondnum&&firstnum>thirdnum) {
		System.out.println("firstnum is higher");
	}
	else if(secondnum>firstnum&&secondnum>thirdnum) {
		System.out.println("secondnum is higher");
	}
	else if(thirdnum>secondnum&&thirdnum>firstnum) {
		System.out.println("thirdnum is higher");
	}

}
}