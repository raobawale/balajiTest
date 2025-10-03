package controlStatement;

public class Jump_Stmt_Break {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Number   :" + i);
			if (i == 5) { // when i reaches 5
				System.out.println(" Breaking the loop at i = : " + i);
				break;
			}
		}
	}

}//so in break statement, once condition is true, remaining left iterations are not performend.
