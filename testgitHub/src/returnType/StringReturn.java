package returnType;

public class StringReturn {

	public static String m1() {

		String x = "I am a robot of string type";

		//System.out.println(x);
		return x; 	//after the return x nothing is written in code.
	}
	
	public static String String_Sum() {
		
		String str1 = "Java  ";
		String str2 = "Programm  ";
		String str3 = str1 + str2;
		return str3;
		
	}

	public static void main(String[] args) {

		String str = StringReturn.m1();
		System.out.println(str);
		
	 String stmS = StringReturn.String_Sum();
	 System.out.println("Summation of Strin  :"+stmS);
		
		

	}

}
