
public class ArrayMulti  
{

	public static void main(String[] args) 
	{
		int multi [][]= {{20, 30, 40, 50, 60}, {25, 35, 45, 55, 65}, { 30, 40, 50, 60, 70}};

		for(int r=0; r<multi.length; r++) {
			for(int c=0; c<multi[r].length; c++) {
				System.out.print(multi[r][c]+ "\t");
			}
			System.out.println();
		}
	}

}
