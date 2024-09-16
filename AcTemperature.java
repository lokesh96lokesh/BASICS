package elseIfLadder;

public class AcTemperature {
	public static void main(String[]args) {
		int temperature=22;
		if (temperature>=16&&temperature<=20) {
			System.out.println("very cold weather");
		}
		else if(temperature>=20&&temperature<=25) {
			System.out.println("cold weather");
		}
		else if(temperature>=25&&temperature<=30) {
			System.out.println("normal weather");
		}
		
		}
}
