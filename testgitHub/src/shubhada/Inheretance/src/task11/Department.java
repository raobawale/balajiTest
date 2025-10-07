package task11;

public class Department  extends Employees{
	private int id;
	private String name;
	private int salary;
	
		public Department () 
		{  super ();
		System.out.println("this is super class  ");	
		}
		
		public Department(int Id, String name,int salary)
		{
		    this.id=Id;
		    this.name=name;
		    this.salary=salary;
			System.out.println("this is empl id :-" +id );
			System.out.println("this is empl name :-" +name);
			System.out.println("this is empl salary :-" +salary);
		}
		
		public static void main(String[] args) {
			Department d=new Department(12345,"nita",379200);
			Department d1=new Department(123456,"shubhada",499200);
			Department d2=new Department(1234567,"priya",509200);
		}
}	


