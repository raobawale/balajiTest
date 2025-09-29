package parameterization;

public class Calculator {
	
	public Float floatSum(float f1, float f2) {
		
	float	f3 = f1+f2;
	System.out.println("Summation of two float  :"+f3);
	return f3;
	}
	
	public int intSum(int n1, int n2) {
		
	int n3 = n1+n2;
	System.out.println("summation of two Integer  :"+n3);
	return n3;
	}
	
	
	public static void main(String[] args) {
		Calculator x = new Calculator();
		Float y = x.floatSum(20.20F, 30.30F);
		System.out.println(y);
		
	int z = x.intSum(24, 56);
	System.out.println(z);
		
	}

}
