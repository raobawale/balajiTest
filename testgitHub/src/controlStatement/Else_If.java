package controlStatement;

public class Else_If {
	
public void m1(String UN, String PW) {
		
		    
if (UN.equals("shirishshahane@gmail.com") && PW.equals("Paris@123")) {
			System.out.println("Login Successful");
		} 
		else if (UN.equals("shirishshahane@gmail.com")) {
			System.out.println("Invalid User Name ");
		} 
		else {
			System.out.println("Invalid Password");
		}
	}
	
	public static void main(String[] args) {
		Else_If x = new Else_If();
		x.m1("shirishshahane@gmail.com", "Paris@123"); // correct
		x.m1("wrong@gmail.com", "Paris@123");          // wrong username
		x.m1("shirishshahane@gmail.com", "wrong");    // wrong password
	}

}
