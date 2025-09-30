package javaPrograms;

public class Sample {
	
	int phoneNo;
	String name;
	
	
	Sample()     // constructor -> Non parameterized
	{
		System.out.println("Non-ParameterizedConstructor is calling--->");
		phoneNo=98123;
		name="testuser";
		
	}
	
	Sample(int phn, String str)     // Parameterized constructor
	{
		System.out.println("Parameterized constructor is calling--->");
		phoneNo=phn;
		name=str;
		
	}
	
	public static void main(String[] args) {
		
		Sample s1 = new Sample(818181,"test123");
		System.out.println(s1.phoneNo);
		System.out.println(s1.name);
		
		
	}

}
