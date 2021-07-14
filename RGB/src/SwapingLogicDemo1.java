
public class SwapingLogicDemo1 
{

	public static void main(String[] args)
	{
		int a=10;
		int b=14;
		
		
		a = a+b-(b=a);

		
		System.out.println( "variable : a =" + a);
		System.out.println("variable : b ="+b);
		

	}

}
