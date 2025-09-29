package test;

public class Tree {

	public static void main(String[] args) {
		System.out.println("Main method");
		Test1();
		Tree t = new Tree();
		t.Test2();

	}

	public static void Test1() {
		System.out.println("Static Test-1");
	}

	public void Test2() {
		System.out.println("Non-Static Test-2");

	}

}
