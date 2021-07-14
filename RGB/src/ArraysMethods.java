
public class ArraysMethods
{

	public static void main(String[] args) 
	{
		int students[]= {20, 25, 30, 35, 45, 55};
		   
		 changeX(students);
		
		for (int y:students) {
		System.out.println(y);
		
	}
		System.out.println();
		
		 changeX(students);
		
		for (int y:students) {
			System.out.println(y);
		
	}
		System.out.println();
changeX(students);
		
		for (int y:students) {
			System.out.println(y);
	}
	}
		public static void changeX (int dummy []) {
			for(int c=0; c<dummy.length; c++) {
			dummy[c]*=27;
			}
		}
	}

