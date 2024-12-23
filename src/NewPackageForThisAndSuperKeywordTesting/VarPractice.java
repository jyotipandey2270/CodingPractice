package NewPackageForThisAndSuperKeywordTesting;

public class VarPractice {
	
	
	String name;
	String phoneNumber;
	String address;
	static String city = "Sidhi";
	
	public void getSurveyData(String name, String phoneNumber, String address)
	{
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}
	
	
	public void display() {
		
		
		System.out.println("all the address of the users: " +name+ " "+city);
	}
	

	public static void main(String[] args) {
		
		VarPractice obj = new VarPractice();
		obj.getSurveyData("jyoti", "9455769877", "meetapur");
		obj.display();
		VarPractice obj1 = new VarPractice();
		obj1.getSurveyData("Ashish", "9755972270", "Hinauti");
		obj1.display();
		VarPractice obj2 = new VarPractice();
		obj2.getSurveyData("Nidhi", "6700023332", "naikin");
		obj2.display();
		VarPractice.city= "test";
		
	}

}
