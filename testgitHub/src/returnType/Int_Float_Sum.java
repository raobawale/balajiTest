package returnType;

public class Int_Float_Sum {
	
	public static int intSum() {
		
		int num1 = 45;
		int num2 = 55;
		int sum = num1 + num2;
		return sum;
	}
	
	public static float floatSum() {
		float num3 = 25.25F;
		float num4 = 65.66f;
		float sum2 = num3+num4;		
		return sum2;			
	}
	
	public static void main(String[] args) {
		Int_Float_Sum.intSum();
		System.out.println(Int_Float_Sum.intSum());
		Int_Float_Sum.floatSum();
		System.out.println(	Int_Float_Sum.floatSum());
		
		System.out.println(Int_Float_Sum.intSum()+Int_Float_Sum.floatSum());
	}

}
