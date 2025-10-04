package task6;


//Write a program to find the sum of nature number from 1 to 1000?
public class Test7 {
      public static void main(String[] args) {
	
    	 
    	
    	int sum=0;
    	int n=2000;
    	for(int i=1; i<=n; ++i)
    	{
    		sum+=i;
    		sum=sum+i;
    	}
    	System.out.println("Sum = " +sum);
}
}
