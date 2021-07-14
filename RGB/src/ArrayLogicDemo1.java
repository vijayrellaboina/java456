
public class ArrayLogicDemo1                                                          
{

	public static void main(String[] args) 
	{
		int arr[]= {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println(arr[0]);
		int arrysize=arr.length;
		System.out.println("arrysize"+ arrysize);
		System.out.println(arr[arrysize-1  ]);

		
		int arr2[][]= new int [3][4];
		int rowcount = arr2.length;
		System.out.println("rowcount" + rowcount);
		int columncount = arr2[2].length;
		System.out.println("columncount" + columncount);
				
	}

}
