package inheritance;

public class Sample {
	public static void main(String[] args) {
		Son s = new Son();
		s.bike();
		
//		Father f = new Father();
//		f.land();
//		f.home();
//		f.money();
		//here we have called the property of father class by creating object of father class.
		//So, if we use "extends" keywords in son class, it will acquire the property of Father class
		//So, simply if we creat the object of Son class and call, all property of Son class directly called here.
		
		
		 //Now, let us call son class property by by single level inheritance.
		s.land();  
		s.home();
		s.money();
	}

}
