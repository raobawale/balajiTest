package task2;

public class Test {
   public static void main(String[] args) {
	  Child  child=new Child();
	  child.m3();
	  child.m5();
	  child.m1();
	   System.out.println(child.rollnu);
	   
	   
	   Father f1= new Child();
	   f1.m5();
	   f1.m6();
	   System.out.println(f1.salary);
	   
	   GrandFather g1=new Child();
	   g1.m1();
	   g1.m3();
	   g1.m4();
	   System.out.println(g1.bankbalance);
	   
	   
}

}
