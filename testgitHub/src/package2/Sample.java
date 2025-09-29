package package2;

import practice1.Sample;

public class Sample {

	public static void main(String[] args) {
		
		Sample.t1(); //Compilation error-->The method t1() is undefined for the type Sample
		
		Sample x = new Sample();
		x.t2();   //Compilation error--<The method t2() is undefined for the type Sample
	}
	}
	

}
