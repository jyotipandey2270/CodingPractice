package NewPackageForThisAndSuperKeywordTesting;

public class SuperChildDemo extends SuperParentDemo {
	
	
	String name = "jyotshna";
	String rollNumber="1111";
	
	
	public SuperChildDemo()
	{
		super("childclassdatabasetesting");
		System.out.println("this is child class constructor");
	}
	
	
	public void getDataTest ()
	
	{
		super.getDataTest();
		System.out.println("This is the child class");
		
		
	}
	
	public void display()
	{
		System.out.println("child class testing pass: " +super.name);
		
	}
	

	public static void main(String[] args) {
		
		SuperChildDemo child = new SuperChildDemo();
		child.display();
		child.getDataTest();
		

	}

}
