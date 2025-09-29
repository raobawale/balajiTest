package practice1;

public class Sample {
	
	protected static void t1() {
	System.out.println("Running protected static method");
	}
	
	protected void t2() {
	System.out.println("Running protected non static method");
	}
	
	
	
	public static void main(String[] args) {
		
		Sample.t1();
		
		Sample x = new Sample();
		x.t2();
	}
	}


