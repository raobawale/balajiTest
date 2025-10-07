package test9;

public class B extends A {
      public B()
      {   this(10);
    	  System.out.println("constuctor -- B");
      }
      public B(int i)
      {      this ("xyz");
    	  System.out.println("constructor -- B-int");
      }
      public B(String s)
      {
    	  System.out.println("constuctor --B-String");
      }
}
