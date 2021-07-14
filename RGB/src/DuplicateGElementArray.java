
public class DuplicateGElementArray {

	public static void main(String[] args) {
		String arr[]= {"java","c","C++","python","Java","c","Java"};
		//2 Duplicate Elements Found
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++) 
		{
			
			for(int j=i+1;j<arr.length;j++) 
			 {
				if(arr[i]==arr[j]) {
					System.out.println("Found Duplicate Element:" +arr[i]);
					flag=true;
				}
				
			}
		}

		if(flag==false) {
			System.out.println("Found Duplicate Not found ");
		}
	}

}
