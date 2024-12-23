package NewPackageForThisAndSuperKeywordTesting;

public class ThisDemo {
	
	String name = "Jyoti";
	
	
	public void getData()
	{
		String name = "Naveen";
		System.out.println(name);
		System.out.println(this.name);	
		
		
	}
	
	
	

	public static void main(String[] args) {

		
		ThisDemo obj = new ThisDemo();
		obj.getData();
		
		
		
		

	}

}
