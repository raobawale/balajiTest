package controlStatement;

public class Jump_Stmt_Continue {
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            if (i == 5 || i == 6) {   // when i is 5
                System.out.println("Skipping number: " + i);
                continue;   // skip this loop and go to next
            }
            
            System.out.println("Number: " + i);
        }
    }

}
