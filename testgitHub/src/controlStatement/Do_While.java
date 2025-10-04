package controlStatement;

public class Do_While {
	public static void main(String[] args) {
//		int n = 12;
//		do {
//		System.out.println(n);	
//		n--;
//		}
//		while(n>5);
//	

		int balance = 0;
		do {

			balance = balance + 100; // depositing 100 every week in pigmee
			System.out.println("Each week balance  :" + balance);
		} while (balance < 500);
		{

			System.out.println("Final total balance :" + balance);  

		}
	}
}
