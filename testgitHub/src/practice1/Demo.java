package practice1;

public class Demo {
	public static void main(String[] args) {
		
		Sample.t1();   //Running protected static method
		
		Sample y = new Sample();
		y.t2();  //Running protected non static method
	}

}
