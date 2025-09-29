package package2;

import package1.DemoP1;

public class Test1P2 {
	public static void main(String[] args) {

		// calling static method from other package
		DemoP1.testm1();

		// calling non static method from other package
		DemoP1 y = new DemoP1();

		y.testm2();
	}

}
