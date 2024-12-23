
public class SpliAndTrim {

	public static void main(String[] args) {
		
	int i,j;
	int count = 0;
	String[] names= {"Apple","mango","banana","Apple"};
	
	for(i=0;i<names.length-1;i++)
	{
		
		for(j=i;j<names.length-i;j++)
		{
			if(names[j]==names[j+1])
			{
				count = count+1;
				System.out.println("duplicate string of the array count :" +count+names[j]);
				
			}
			
		}
		
	}
	
	
	
	
	

	
													
	
		
	}

}
