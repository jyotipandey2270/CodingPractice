package NewPackageForThisAndSuperKeywordTesting;

public class SuperParentDemo {
	
	
	
	String name = "Testing";
	
	
	public void getDataTest ()
	{
		System.out.println("This is the parent class");
		
		
	}
	
	public SuperParentDemo(String rollNumber)
	{
		
		System.out.println("this is parent class constructor :" +rollNumber);
	}
	

	public static void main(String[] args) {
		
		
		SuperParentDemo parent = new SuperParentDemo("databasetesting");
		

	}

}
