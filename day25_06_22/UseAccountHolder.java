package day25_06_22;

public class UseAccountHolder {
	public static void main (String[]args) {
		AccountHolder accountHolder1 = new AccountHolder();
		accountHolder1.name="mano";
		accountHolder1.age=26;
		accountHolder1.gender="male";
		accountHolder1.accountNumber=324545456433l;
		accountHolder1.monthlyIncome=21000l;
		accountHolder1.savingPercentage=18;
		AccountHolder accountHolder2 = new AccountHolder();
		accountHolder2.name="savithri";
		accountHolder2.age=25;
		accountHolder2.gender="female";
		accountHolder2.accountNumber=324545456434l;
		accountHolder2.monthlyIncome=20000l;
		accountHolder2.savingPercentage=20;
		AccountHolder accountHolder3 = new AccountHolder();
		accountHolder3.name="kamban";
		accountHolder3.age=30;
		accountHolder3.gender="male";
		accountHolder3.accountNumber=324545456435l;
		accountHolder3.monthlyIncome=30000l;
		accountHolder3.savingPercentage=10;
		System.out.println("saving amount of mano = "+accountHolder1.monthlyIncome*accountHolder1.savingPercentage/100);
		System.out.println("saving amount of mano = "+accountHolder2.monthlyIncome*accountHolder2.savingPercentage/100);
		System.out.println("saving amount of mano = "+accountHolder3.monthlyIncome*accountHolder3.savingPercentage/100);
	}

}
