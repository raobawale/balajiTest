package controlStatement;

public class While_Loop {
	
	public static void main(String[] args) {
		
//		 int count = 1;
//		while( count<=20) {
//			System.out.println("Count :"+count);
//			count++;			
//		}
		
		
		int balance = 0;  //intial balance
		while(balance< 500) {
			balance = balance + 100;
			System.out.println("Current Balance : "+ balance);			
		}
		
	}

}
