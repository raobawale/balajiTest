package task12;

public class B extends A {
	int x=700;
     public void m1()
     {   int x=400;
     System.out.println(super.x);
    	 System.out.println(x);
    	 System.out.println(this.x);
    	 
     }
     public void m2()
     {
    	System.out.println("this is m2 methdo");
     }
}
