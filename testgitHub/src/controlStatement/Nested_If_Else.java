package controlStatement;

public class Nested_If_Else {
	
	
	int marks;
	
	public  void m1(int marks) {
		
		if(marks >= 75){
			System.out.println("You got distinction");
		}
			
		else if(marks >= 60 && marks < 75)
		{
			System.out.println("You got First Class");
		}
		
		else if(marks>50 && marks < 60) 
		{
			System.out.println("You got second class");		
			
		}
		
		else if (marks >=35 && marks < 50) 
		{
			System.out.println("Congratulations you are passed ");
		}
		
		else {
			System.out.println("Sorry, better luck next time");
		}	
			
	}
	
	public static void main(String[] args) {
		
		Nested_If_Else x = new Nested_If_Else();
		x.m1(33);
	}

}
