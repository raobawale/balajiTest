package task6;

import java.util.Scanner;

public class Test6 {
     public static void main(String[] args) {
    	 
	Scanner sc=new Scanner(System.in);
	
	System.out.println("progrem start");
	
	  int num =sc.nextInt();
	  if(num%2==0)// 10%2==>0==0 true, //13%2==>0==1 flase
	  {
		  System.out.println(num+ "is even number");
	  }
	  else
	  {
		  System.out.println(num+ "is odd number");
	  }
	  
	  System.out.println("program end");
}
}
