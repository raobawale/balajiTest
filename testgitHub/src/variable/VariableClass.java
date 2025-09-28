package test;

public class VariableClass {

	public static void main(String[] args) throws InterruptedException {

		
		for(int i=0; i<=10;i++) 
		{
		
			System.out.println("Iteration: "+i);
			
			for (int j=0; j<=4;j++) {
				System.out.println("    Inside loop: "+j);
			}
		}
		
		
	}

}
