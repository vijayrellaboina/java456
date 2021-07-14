
public class ArrayDemo2 
{

	public static void main(String[] args)
	{
		int arr[][]= {{  10, 20, 30, 40}, {10, 20, 30, 40}, {10, 20, 30, 40}};

//		arr[0][0]=10;
//		arr[0][1]=20;
//		arr[0][2]=30;
//		arr[0][3]=40;
//		
//		arr[1][0]=10;
//		arr[1][1]=20;
//		arr[1][2]=30;
//		arr[1][3]=40;
//		
//		arr[2][0]=10;
//		arr[2][1]=20;
//		arr[2][2]=30;
//	    arr[2][3]=40;
		System.out.println(234567%100);
		
		int arr6[]= {10, 20, 30, 40, 50};
		int arrsize=arr6.length;
		System.out.println("arrsize" + arrsize);
		System.out.println(arr6[arrsize-1]);
		
		int rra[][]= {{122, 222, 333, 444}, {1222, 3333, 4444, 5555}, {2222, 3847, 3456, 4567}};
		
		  System.out.println("savory");
		 
		  
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++) {
				System.out.print(arr[r][c] + "\t");
				System.out.print(rra[r][c] + "\t");
			}
			System.out.println();
		//	System.out.print(rra[r][c] + "\t");
		}
		
		
		
	}

}
