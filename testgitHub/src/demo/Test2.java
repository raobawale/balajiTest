package variables;

public class Test2 {
	int c= 100; //globle variable
			
			public void m1()
			{
		
		int a=100; //local veriable
		
		System.out.println(a);
		System.out.println(c);
			}
	public void m2()
	
	{
		
		int b= 100;//local veriable 
		
		System.out.println(b);
		System.out.println(c);
	}
	//main method
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		
		t2.m1();
		t2.m2();
		
	}

}
