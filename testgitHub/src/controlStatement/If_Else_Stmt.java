package controlStatement;

public class If_Else_Stmt {

	int a;  //global non static variable
	int b;   //global non static variable

	public static void m1(int a, int b) {

		if (b > a) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("a is not greater than b");
		}
	}

	public static void main(String[] args) {
		If_Else_Stmt.m1(24, 13);

	}

}
