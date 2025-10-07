package task3;

public class Test {
public static void main(String[] args) {
	School k=new School();
	k.school1();
	k.school2();
	k.collge1();
	k.collge2();
	k.university1();
	k.university2();
	
	Collage c=new School();
	c.collge1();
	c.collge2();
	c.university1();
	c.university2();

	University l=new Collage();
	l.university1();
	l.university2();
	
	
}
	
}
