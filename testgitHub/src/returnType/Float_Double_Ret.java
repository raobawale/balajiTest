package returnType;

public class Float_Double_Ret {

	public float f1() {

		float a = 20.21f;
		float b = 30.33f;
		float c = a / b;
		return c;

	}
	
	public static void main(String[] args) {
		
		Float_Double_Ret x = new Float_Double_Ret();
		float flt = x.f1(); 			//return float  0.66633695
		double dolt = x.f1(); 			//return double  0.6663369536399841
		
		System.out.println(dolt);
		System.out.println(flt);
	}

}
