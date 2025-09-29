package test;

public class Calculator1 {
	//Main msethod
		public static void main(String[] args) {
			System.out.println("Calculator");
			//Calling static method
			addn();
			sub();	
		
//			System.out.println("Addition:"+result);
			
		}
		
		//Regular static method 
		public static void addn() {
			int fn=5;
			int sn=10;
			int result=fn+sn;
			System.out.println("Addition:"+result);
			
		}
		
		//Regular static method 
		public static void sub() {
			int fn=10;
			int sn=5;
			int result=fn-sn;
			System.out.println("Substraction:"+result);
			
		}

}
