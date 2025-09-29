package returnType;

public class IntegerRet {

	public int m2() {

		int a = 20;
		int b = 30;
		int c = a + b;
		int d = a * b;
		int e = d / c;
		return e;
	}

	public static void main(String[] args) {
		IntegerRet x = new IntegerRet();
		int y = x.m2();
		System.out.println(y);
	}

}
