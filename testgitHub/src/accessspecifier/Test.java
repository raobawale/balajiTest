package accessspecifier;

public class Test {

	private static void m1() {
		System.out.println("Static private method");
	}

	private void m2() {

		System.out.println("non static private method");
	}
	
	
	public static void main(String[] args) {
		
		Test.m1();
		
		Test x = new Test();
		x.m2();
	}

}
