package parameterization;

public class BasicCalculator {
	
	public static void Sum(int b, int c) {
		
		int a = b+c;
		System.out.println("Summation on two number :"+a);
		
		int d = b-c;
		System.out.println("Substarction of two number  :"+d);
		
		int e = b*c;
		System.out.println("Muliplication of two number   :"+e);
		
		double f = b/c;
		System.out.println("Division of two number  :"+f);
	}
	
	public static void main(String[] args) {
		
		BasicCalculator.Sum(65, 24);
	}
	
	
	

}
