package test;

public class Test {
	//Main method
		public static void main(String[] args) {		
		System.out.println("Mian method is executed");
		
		//Static Method call
		testMethod();
		
		//Create object for class
		Test b=new Test();
		
		//Non static method call
		b.testMethod1();
		
		System.out.println("Main method execution stoped");			
		}
		
		//Static method
		public static void testMethod() {		
			System.out.println("static test method method is executed");
		}
		
		//Non-static method
		public void testMethod1() {
			System.out.println("non static test method-1 executed");
			
		}


}
