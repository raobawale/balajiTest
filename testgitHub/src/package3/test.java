package package3;
import package2.A;

public class test {
	
	//A.test();
	
	public static void main(String[] args) {
	
	A x = new A();
	x.test1();    //compilation error
	
	A.test();    //compilation error
}

}
