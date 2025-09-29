package parameterization;

public class Formula {
	
	
	public static void test1(int a, int b) {
		
		int x = a*a+2*a*b+b*b;
		System.out.println(x);
		
		int y = a*a-2*a*b+b*b;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		 Formula.test1(2, 4);
	}

}

